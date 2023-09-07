

import java.util.Scanner;

/**
 *
 * @author DavidLeon
 */
public class Captura {
    static Scanner next1=new Scanner(System.in);
    
    static int num1;
    
    public static int lec(){
        
        num1=next1.nextInt();
        return num1;
    }
    public static int[][]mrc(){
    int matrizA1[][]=new int[num1][num1];
            for(int i=0;i<num1;i++){
            for(int j=0;j<num1;j++){
            System.out.println("Ingrese un numero para la matriz: ");
            matrizA1[i][j]=next1.nextInt();
            }
            }
            return matrizA1;
    }
    public static void impm(int a,int b,int c[][]){
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
        System.out.print(c[i][j]+"\t");}
        System.out.print("\n");}
        }
    public static int entradaint(){
Scanner in = new Scanner(System.in);
return in.nextInt();

    }
    public static void impm2(int)
    
    
    }



