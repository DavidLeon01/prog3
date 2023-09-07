/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu_matrices;

import java.util.Scanner;

/**
 *
 * @author DavidLeon
 */
public class Menu_Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int esp;
        System.out.println("Seleccione una Opcion: \n1.Suma De Matrices \n2.Producto Punto \n3.Producto de un escalar \n4.Transpuesta de una Matriz. \n5.Que opcion desea: ");
        opcion = entrada.nextInt();
        
        switch (opcion){
        case 1:{
    System.out.println("Ingrese el numero de filas de la matriz: ");
    esp = entrada.nextInt();
            
    int matrizA[][] = new int[esp][esp];
    int matrizB[][] = new int[esp][esp];
    int matrizC[][] = new int[esp][esp];
    int matrizD[][] = new int[esp][esp];
            
    
    for (int i=0;i<esp;i++){
     for (int j=0; j<esp;j++){
     System.out.println("Ingrese numero para la matriz A: ");
     matrizA[i][j] = entrada.nextInt();
     }
    }
    matrizA=
    }
        
        }
        
        
    }
}
