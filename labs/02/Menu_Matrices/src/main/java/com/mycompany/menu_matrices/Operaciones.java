/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu_matrices;

/**
 *
 * @author DavidLeon
 */
public class Operaciones {
    public static int [][] suma(int a,int b[][],int c[][],int d[][]){
    for(int i=0;i<a;i++){
    for(int j=0;j<a;j++){
    d[i][j]=(b[i][j]+c[i][j]);
    }
    }
    return d;
    }
}
public static int [][] producto(int fila1,int fila2,int columna1,int columna2,int a[][],int b[][]){
}
