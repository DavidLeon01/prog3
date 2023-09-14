
import java.util.Random;

class Operaciones {
    // Método de ordenamiento burbuja
    public static void Ordenamientoburbuja(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenamiento por inserción
    public static void Ordenamientoinsercion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            double f1 = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > f1) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = f1;
        }
    }

    // Método de ordenamiento por selección
    public static void Ordenamientoseleccion(double[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int f2 = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[f2]) {
                    f2 = j;
                }
            }
            double temp = arreglo[f2];
            arreglo[f2] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    // Método de ordenamiento mergesort
    public static void Ordenamientomergesort(double[] arreglo, int izq, int der) {
        if (izq < der) {
            int mid = (izq + der) / 2;
            Ordenamientomergesort(arreglo, izq, mid);
            Ordenamientomergesort(arreglo, mid + 1, der);
            combinacion(arreglo, izq, mid, der);
        }
    }

    private static void combinacion(double[] arreglo, int izq, int mid, int der) {
        int n1 = mid - izq + 1;
        int n2 = der - mid;
        double[] izqarrglo = new double[n1];
        double[] derarrglo = new double[n2];

        for (int i = 0; i < n1; i++) {
            izqarrglo[i] = arreglo[izq + i];
        }
        for (int j = 0; j < n2; j++) {
            derarrglo[j] = arreglo[mid + 1 + j];
        }

        int i = 0, j = 0, k = izq;
        while (i < n1 && j < n2) {
            if (izqarrglo[i] <= derarrglo[j]) {
                arreglo[k] = izqarrglo[i];
                i++;
            } else {
                arreglo[k] = derarrglo[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arreglo[k] = izqarrglo[i];
            i++;
            k++;
        }

        while (j < n2) {
            arreglo[k] = derarrglo[j];
            j++;
            k++;
        }
    }
}