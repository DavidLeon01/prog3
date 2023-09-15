import java.util.Scanner;
import java.util.Random;

public class Lectura {

  static int tam1;

  static Scanner in = new Scanner(System.in);
  
  public static int nxt() {

    tam1 = in.nextInt();
    return tam1;
  }
  public static void ejecutar() {
    int[] variables = {
      100,
      500,
      1000,
      5000,
      10000
    };

    System.out.println("Tamaño del Arreglo | Burbuja (ns) | Inserción (ns) | Selección (ns) | Mergesort (ns)");

    for (int mtd: variables) {
      double[] arreglo = new double[mtd];
      Random random = new Random();

      // Se llena el arreglo con números aleatorios(RANDOM)
      for (int i = 0; i < mtd; i++) {
        arreglo[i] = random.nextDouble();
      }

      // SE Clona el arreglo para cada método de ordenamiento
      double[] arrgloburbuja = arreglo.clone();
      double[] arrgloinsercion = arreglo.clone();
      double[] arrgloseleccion = arreglo.clone();
      double[] arrglomargesort = arreglo.clone();

      long Ti, Fnl;

      // Medir el tiempo en nanoseg para el método de ordenamiento burbuja
      Ti = System.nanoTime();
      Operaciones.Ordenamientoburbuja(arrgloburbuja);
      Fnl = System.nanoTime();
      long TB = Fnl - Ti;

      // Medir el tiempo en nanoseg para el método de ordenamiento por inserción
      Ti = System.nanoTime();
      Operaciones.Ordenamientoinsercion(arrgloinsercion);
      Fnl = System.nanoTime();
      long TI = Fnl - Ti;

      // Medir el tiempo en nanoseg para el método de ordenamiento por selección
      Ti = System.nanoTime();
      Operaciones.Ordenamientoseleccion(arrgloseleccion);
      Fnl = System.nanoTime();
      long TS = Fnl - Ti;

      // Medir el tiempo en nanoseg para el método de ordenamiento mergesort
      Ti = System.nanoTime();
      Operaciones.Ordenamientomergesort(arrglomargesort, 0, arrglomargesort.length - 1);
      Fnl = System.nanoTime();
      long TM = Fnl - Ti;

      // Imprime los resultados en forma de tabla de comparación
      System.out.printf("%17d | %13d | %14d | %13d | %15d%n", mtd, TB, TI, TS, TM);
    }
  }
}