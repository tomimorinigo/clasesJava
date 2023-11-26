CREATE TABLE clientes (
id_cliente INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20),
apellido VARCHAR(20),
email VARCHAR(100),
telefono VARCHAR(20)
);

INSERT INTO clientes (nombre, apellido, email, telefono) VALUES 
('Tomas', 'Morinigo', 'tomasmorinigo@email.com', '351412165')
('Benjamin', 'Fernandez', 'benjafernandez@email.com', '324587841')
('Lautaro', 'Martinez', 'lautamartinez@email.com', '216578911')

CREATE TABLE productos (
id_producto INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(30)
precio DECIMAL(10,2)
stock INT
);

INSERT INTO productos (nombre, precio, stock) VALUES
('Buzo', 75.99, 20),
('Zapatillas', 49.99, 50),
('Remera', 49.99, 25);

CREATE TABLE ventas (
id_venta INT PRIMARY KEY AUTO_INCREMENT,
id_cliente INT,
fecha DATE,
total DECIMAL(10, 2)
);

INSERT INTO ventas (id_cliente, fecha, total) VALUES
(1, '2023-04-10', 45.99),
(2, '2023-04-10', 255.00),
(1, '2023-04-11', 79.99);

UPDATE productos SET precio = 59.99 WHERE id_producto = 2;

UPDATE productos SET stock = 75 WHERE id_producto = 1;

UPDATE clientes SET email = 'pedro.fernandez@gmail.com' WHERE id_cliente = 3;

DELETE FROM productos WHERE id_producto = 3;

CREATE TABLE categorias (
id_categoria INT PRIMARY KEY,
nombre_categoria VARCHAR(50)
);

INSERT INTO categorias (id_categoria, nombre_categoria) VALUES
(1, 'Ropa'),
(2, 'Electrónica'),
(3, 'Hogar');

CREATE TABLE productos (
id_producto INT PRIMARY KEY,
nombre_producto VARCHAR(50),
precio DECIMAL(10, 2),
stock INT,
id_categoria INT,
FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
);

INSERT INTO productos (id_producto, nombre_producto, precio, stock, id_categoria) VALUES
(1, 'Remera', 35.99, 100, 1),
(2, 'Pantalón', 49.99, 50, 1),
(3, 'Smartphone', 399.99, 20, 2),
(4, 'TV', 599.99, 10, 2),
(5, 'Sofá', 899.99, 5, 3),
(6, 'Mesa', 299.99, 15, 3);

CREATE TABLE clientes (
id_cliente INT PRIMARY KEY,
nombre VARCHAR(50),
apellido VARCHAR(50),
email VARCHAR(100),
telefono VARCHAR(20)
);

INSERT INTO clientes (id_cliente, nombre, apellido, email, telefono) VALUES
(1, 'Juan', 'Pérez', 'juan.perez@gmail.com', '555-1234'),
(2, 'María', 'Gómez', 'maria.gomez@yahoo.com', '555-5678'),
(3, 'Pedro', 'Fernández', 'pedro.fernandez@hotmail.com', '555-9012');

CREATE TABLE ventas (
id_venta INT PRIMARY KEY,
id_cliente INT,
id_producto INT,
fecha DATE,
total DECIMAL(10, 2),
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

INSERT INTO ventas (id_venta, id_cliente, id_producto, fecha, total) VALUES (1, 1, 1, '2023-04-10', 25.99);

SELECT categorias.nombre_categoria, productos.nombre_producto FROM categorias JOIN productos ON categorias.id_categoria = productos.id_categoria;

SELECT clientes.nombre, productos.nombre_producto, SUM(ventas.total) AS total_ventas FROM clientes JOIN ventas ON clientes.id_cliente = ventas.id_cliente JOIN productos
ON ventas.id_producto = productos.id_producto GROUP BY clientes.nombre, productos.nombre_producto;