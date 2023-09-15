public class Menu_de_Matrices {

  public static void main(String[] args) {

    Operaciones op = new Operaciones();
    int esp;
    int opcion, opcion2;
    int f1, f2;
    int col1, col2;
    int num1;
    do {
      System.out.println("Elja Una Opcion: \n1.Suma de Matrices \n2.Producto Punto \n3.Matriz por un escalar \n4.Matriz Traspuesta \n5.Salir");
      opcion = Captura.nxt();
      switch (opcion) {
      case 1: {
        Captura.imprimir("Ingrese el numero de filas de la matriz");
        esp = Captura.nxt();
        int matrizA[][] = new int[esp][esp];
        int matrizB[][] = new int[esp][esp];
        int matrizC[][] = new int[esp][esp];
        int matrizD[][] = new int[esp][esp];
        Captura.imprimir("Ingrese los numeros para la matriz A:");
        matrizA = Captura.mtzcuadrada();
        Captura.imprimir("*****************");
        Captura.imprimir("Ingrese los numeros para la matriz B:");
        matrizB = Captura.mtzcuadrada();
        matrizC = op.suma(esp, matrizA, matrizB, matrizD);
        Captura.escritura(esp, esp, matrizC);
        break;
      }
      case 2: {
        Captura.imprimir("Ingrese el numero de filas de la primera Matriz");
        f1 = Captura.nxt();
        Captura.imprimir("Ingrese el numero de columnas de la primera Matriz");
        col1 = Captura.nxt();
        Captura.imprimir("Ingrese el numero de filas de la segunda Matriz");
        f2 = Captura.nxt();
        Captura.imprimir("Ingrese el numero de columnas de la segunda Matriz");
        col2 = Captura.nxt();
        int matrizA[][] = new int[f1][col1];
        int matrizB[][] = new int[f2][col2];
        int matrizC[][] = new int[f1][col2];
        if (col1 == f2) {
          Captura.imprimir("Ingrese los numeros para la matriz A:");
          matrizA = Captura.ordenarmtz(f1, col1);
          Captura.imprimir("Ingrese los numeros para la matriz B:");
          matrizB = Captura.ordenarmtz(f2, col2);
          matrizC = op.producto(f1, col1, f2, col2, matrizA, matrizB);
          Captura.escritura(f1, col2, matrizC);
        } else {
          Captura.imprimir("Las dimensiones ingresadas no cumplen los criterios del producto punto");
        }
        break;
      }
      case 3: {
        Captura.imprimir("Elija un tamaño de matriz \n1.2X2 \n2.3X3 \n3.4X4 ");
        opcion2 = Captura.nxt();
        switch (opcion2) {
        case 1: {
          esp = 2;
          int matrizA[][] = new int[esp][esp];
          int matrizB[][] = new int[esp][esp];
          matrizA = Captura.ordenarmtz(esp, esp);
          Captura.imprimir("Ingrese un numero por el que multiplicar la matriz");
          num1 = Captura.nxt();
          matrizB = Operaciones.escalar(esp, num1, matrizA);
          Captura.escritura(esp, esp, matrizB);
          break;
        }
        case 2: {
          esp = 3;
          int matrizA[][] = new int[esp][esp];
          int matrizB[][] = new int[esp][esp];
          matrizA = Captura.ordenarmtz(esp, esp);
          Captura.imprimir("Ingrese un numero por el que multiplicar la matriz");
          num1 = Captura.nxt();
          matrizB = Operaciones.escalar(esp, num1, matrizA);
          Captura.escritura(esp, esp, matrizB);
          break;
        }
        case 3: {
          esp = 4;
          int matrizA[][] = new int[esp][esp];
          int matrizB[][] = new int[esp][esp];
          matrizA = Captura.ordenarmtz(esp, esp);
          Captura.imprimir("Ingrese un numero por el que multiplicar la matriz");
          num1 = Captura.nxt();
          matrizB = Operaciones.escalar(esp, num1, matrizA);
          Captura.escritura(esp, esp, matrizB);
          break;
        }
        }
        break;
      }
      case 4: {
        Captura.imprimir("Ingrese el numero de filas");
        f1 = Captura.nxt();
        Captura.imprimir("Ingrese el numero de columnas");
        col1 = Captura.nxt();
        int matrizA[][] = new int[f1][col1];
        int matrizB[][] = new int[col1][f1];
        Captura.ordenarmtz(f1, col1);
        matrizB = Operaciones.traspuesta(f1, col1, matrizA);
        Captura.escritura(f1, col1, matrizB);
        break;
      }
      }
    } while (opcion != 5);
  }
}