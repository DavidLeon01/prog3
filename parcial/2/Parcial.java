import java.util.Scanner;
import java.util.Timer;

public class Parcial {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        Timer timer = new Timer();

        while (true) {
            System.out.print("Que tiempo en segundos desea o oprima 'e' para salir: ");

            int timeEspera;
            if (on.hasNextInt()) {
                timeEspera = on.nextInt();
            } else {
                String input = on.next();
                if (input.equalsIgnoreCase("e")) {
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número o 'e' para salir.");
                    continue;
                }
            }

            System.out.print("Ingrese el mensaje para este temporizador: ");
            String mns = on.next();

            temporizador instancia = new temporizador(mns);
timer.schedule(instancia, timeEspera * 1000);

System.out.println();
System.out.println("Temporizador programado para " + timeEspera + " segundos con el mensaje: " + mns);

            System.out.print("¿Desea programar otro temporizador? (s/n): ");
            String respuesta = on.next();

            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        timer.cancel();
        on.close();  
    }
}

