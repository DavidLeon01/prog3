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
        Operaciones op = new Operaciones();
        int opcion;
        int esp;
        int f1;
        int c1;
        int f2;
        int c2;
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
     for (int i=0;i<esp;i++){
     for (int j=0; j<esp;j++){
     System.out.println("Ingrese numero para la matriz A: ");
     matrizB[i][j] = entrada.nextInt();
     }
    }
    matrizC = op.suma(esp,matrizA,matrizB,matrizD);
    
        for(int i=0;i<esp;i++){
        for(int j=0;j<esp;j++){
        System.out.print(matrizC[i][j]+"\t");}
        System.out.print("\n");}
        }
        case 2:{
        System.out.println("Ingrese el numero de filas de la primera Matriz");
        f1=entrada.nextInt();
        System.out.println("Ingrese el numero de columnas de la primera Matriz");
        c1=entrada.nextInt();
        System.out.println("Ingrese el numero de filas de la segunda Matriz");
        f2=entrada.nextInt();
        System.out.println("Ingrese el numero de columnas de la segunda Matriz");
        c2=entrada.nextInt();
        int matrizA[][] = new int [f1][c1];
        int matrizB[][] = new int [f2][c2];
        int matrizC[][] = new int [f1][c2];
        if(c1 == f2){
        System.out.println("Ingrese los numeros para la matriz A: ");
        for(int i=0;i<f1;i++){
        for (int j=0;j<c1;j++){
        System.out.println("Ingrese un numero para la matriz A: ");
        matrizA[i][j]=entrada.nextInt();
        }
        }
        System.out.println("Ingrese los numeros para la matriz B: ");
        for(int i=0;i<f2;i++){
        for (int j=0;j<c2;j++){
        System.out.println("Ingrese un numero para la matriz B: ");
        matrizB[i][j]=entrada.nextInt();
        }
        }
        matrizC = op.producto(f1,c1,f2,c2,matrizA,matrizB);
        for(int i=0;i<f1;i++){
        for(int j=0;j<c2;j++){
        System.out.print(matrizC[i][j]+"");
        }
        System.out.println("\n");
        }
        }else{
        System.out.println("Las dimensiones no cumplen los criterios del producto punto");}
        }
        }
        
        
    }
}
