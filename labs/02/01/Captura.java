import java.util.Scanner;

/**
 *
 * @author ALEJANDRO
 */
public class Captura {

    static int tam1;

    static Scanner in = new Scanner(System.in);

    public static int nxt() {

        tam1 = in.nextInt();
        return tam1;
    }

    public static int[][] mtzcuadrada() {

        int matrizA1[][] = new int[tam1][tam1];

        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam1; j++) {

                System.out.println("Ingrese un numero para la matriz :");
                matrizA1[i][j] = in.nextInt();

            }

        }

        return matrizA1;
    }

    public static int[][] ordenarmtz(int a, int b) {
        int matrizB1[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.println("Ingrese un numero para la matriz :");
                matrizB1[i][j] = in.nextInt();

            }

        }

        return matrizB1;
    }

    public static void escritura(int a, int b, int c[][]) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.print(c[i][j] + "\t");

            }
            System.out.print("\n");

        }

    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);

    }

}
