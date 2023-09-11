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

        }}}