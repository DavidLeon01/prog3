
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DavidLeon
 */
class Entrada {
private static Scanner input = new Scanner (System.in);

   public static String readText(String mss) {
 System.out.println(mss);
 return input.nextLine();
    }

    public static int readInt(String mss) {
    System.out.println(mss);
    return input.nextInt();
    }
    public static void crc(){
            input.nextLine();
    }
 
    
}
