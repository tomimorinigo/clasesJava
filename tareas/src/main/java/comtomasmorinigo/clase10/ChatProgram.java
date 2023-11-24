package comtomasmorinigo.clase10;

import java.io.FileWriter;
import java.util.Scanner;

public class ChatProgram {
    private static String nombre;
    private static final String RUTA_ARCHIVO_CHAT = "tareas/src/main/java/comtomasmorinigo/clase10/chat.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        while (true) {
            System.out.println("Elija una opción:");
            System.out.println("1. Escribir un mensaje");
            System.out.println("2. Leer todos los mensajes");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    escribirMensaje(scanner);
                    break;
                case 2:
                    leerMensajes();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    scanner.close();
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    public static void escribirMensaje(Scanner scanner) {
        System.out.println("Ingrese un mensaje: ");
        String mensaje = scanner.nextLine();

        try(FileWriter writer = new FileWriter(RUTA_ARCHIVO_CHAT, true)) {
            writer.write(nombre + ": " + mensaje + "\n");
            writer.close();
            System.out.println("Mensaje escrito correctamente");
        } catch (Exception e) {
            System.out.println("Error al escribir el mensaje");
        }
    }

    public static void leerMensajes() {
        try(Scanner scanner = new Scanner(new java.io.File(RUTA_ARCHIVO_CHAT))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer los mensajes");
        }
    }
}
