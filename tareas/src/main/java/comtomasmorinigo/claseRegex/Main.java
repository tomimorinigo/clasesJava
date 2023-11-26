package comtomasmorinigo.claseRegex;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // 1. Realice un programa que tome como parámetros un archivo y una expresión regular, 
    // para cada línea, debe escribir el número y si la misma se corresponde con la expresión regular o no 

    public static void main(String[] args) {
        
        String path = "tareas\\src\\main\\java\\comtomasmorinigo\\claseRegex\\archivo.txt";
        File archive = new File(path);
        String absolutePath = archive.getAbsolutePath();
        
        // Punto1(absolutePath);
        Punto2(absolutePath);
    }

    private static void Punto1(String path){
        // 1. Realice un programa que tome como parámetros un archivo y una expresión regular, 
        // para cada línea, debe escribir el número y si la misma se corresponde con la expresión regular o no 

        String regex = "^4\\d{2}$"; // Numeros de 400 a 499
        final Pattern pattern = Pattern.compile(regex);
        
        try {
            for (String line : Files.readAllLines(Paths.get(path))){
                    System.out.println(line);
                    boolean matches = pattern.matcher(line).matches();
                    System.out.println("Matches: " + matches);
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Punto2(String path){
        // 2. A partir del programa anterior, hacer lo mismo, solo que la expresión regular debe tener
        // grupos y por cada línea se deben imprimir los grupos o textos extraídos de la misma.
        
        Pattern pattern = Pattern.compile("(^4[0-9]{2})([a-z]{2})$"); // Numeros de 400 a 499 y 2 letras

        try {

            for (String line : Files.readAllLines(Paths.get(path))){
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println("Found match: " + matcher.group());
                    System.out.println("Group 1: " + matcher.group(1));
                    System.out.println("Group 2: " + matcher.group(2));
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

