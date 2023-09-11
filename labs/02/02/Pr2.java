package com.mycompany.pr2;

import java.util.Arrays;
import java.util.Random;

public class Pr2 {
    public static void main(String[] args) {
        int[] variables = { 100, 500, 1000, 5000, 10000 };

        System.out.println("Tamaño del Arreglo | Burbuja (ns) | Inserción (ns) | Selección (ns) | Mergesort (ns)");

        for (int mtd : variables) {
            double[] arreglo = new double[mtd];
            Random random = new Random();

            // Se llena el arreglo con números aleatorios(RANDOM)
            for (int i = 0; i < mtd; i++) {
                arreglo[i] = random.nextDouble();
            }

}