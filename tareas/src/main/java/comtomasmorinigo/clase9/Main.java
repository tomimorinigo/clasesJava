package comtomasmorinigo.clase9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Persona> personas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Que desea hacer?:");
            System.out.println("1. Cargar persona");
            System.out.println("2. Listar personas");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    cargarPersona(scanner);
                    break;
                case 2:
                    listarPersonas();
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

    public static void cargarPersona(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ingrese nombre de una persona: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese apellido de una persona: ");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento de una persona: ");
        String fechaNacimiento = scanner.nextLine();

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setFechaNacimiento(fechaNacimiento);

        personas.add(persona);
        System.out.println("Persona cargada correctamente");
    }

    public static void listarPersonas() {
        System.out.println("Listando personas...");

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + ", nacido/a el "
                    + persona.getFechaNacimiento());
        }
    }
}
