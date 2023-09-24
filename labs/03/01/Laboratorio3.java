
import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author DavidLeon
 */
public class Laboratorio3 {

   
        static LinkedList<Asignatura> materias = new LinkedList<>();
        static Queue<Registro> registr = new LinkedList<>();
        
    public static void main(String[] args) {
 lec_archivo();
 Salida.exit("Ingrese las Asignaturas a inscribir");
 registro_asignaturas();
 Salida.exit_Asignatura(materias);
    }
private static void registro_estudiante() {
String nombre = Entrada.readText("Ingrese el nombre del Estudiante: ");
String codigo = Entrada.readText("Ingrese el codigo del Estudiante: ");
String correo = Entrada.readText("Ingrese el correo del Estudiante: ");
int semestre = Entrada.readInt("Ingrese el semestre: ");
Estudiante estudian = new Estudiante(nombre,codigo,correo,semestre);
registr.add(new Registro(estudian));
    }
    private static void registro_asignaturas() {
int creditos= 0;
int creditostemp=0;
String preg;
while(creditos<5){
String nombre_asignatura = Entrada.readText("Ingrese el nombre de la asignatura:");
}
    }
    
}
