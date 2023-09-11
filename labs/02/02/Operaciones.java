package com.mycompany.pr2;
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

    