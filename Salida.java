
import static java.sql.DriverManager.println;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DavidLeon
 */
class Salida {

    static void exit_Asignatura(LinkedList<Asignatura> materiass) {
    for(int i=0;i<materiass.size();i++){
    Asignatura temporal=materiass.get(i);
    System.out.println("Asignatura: "+temporal.getNombre());
    System.out.println("Codigo"+temporal.getCodigo());
    System.out.println("Semestre: "+temporal.getSemestre());
    System.out.println("Creditos: "+temporal.getNumero_creditos());
    System.out.println("Horario de clase: "+ temporal.getHorario());
    }
    }

    static void exit(String a){
        System.out.println(a);
    }
}

    

