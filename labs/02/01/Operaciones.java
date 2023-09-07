
public class Operaciones {

    public static int[][] suma(int a, int b[][], int c[][], int d[][]) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                d[i][j] = (b[i][j] + c[i][j]);
            }
        }
        return d;
    }
    
    public static int[][] producto(int fila1,int fila2,int columna1,int columna2,int a[][],int b[][]){
int c[][] = new int[fila1][columna2];

for(int i=0;i<fila1;i++){
    for(int j=0;j<columna2;j++){
        for(int h=0;h<columna1;h++){
            c[i][j]=c[i][j]+(a[i][h]*b[h][j]);
}
}
}
return c;
}
}

