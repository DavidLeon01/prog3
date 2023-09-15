
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ejecutar el programa");
        System.out.println("2. No ejecutar el programa");
        System.out.print("Digite su opcion: ");
        int opcion = scanner.nextInt();

        if(opcion == 1) {
            Lectura.ejecutar();
        } else if (opcion == 2) {
            System.out.println("El programa no se ejecutará.");
        } else {
            System.out.println("Opción no válida.");
        }
        
        scanner.close();
    }
}

    
