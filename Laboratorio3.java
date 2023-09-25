
import java.io.BufferedReader;
import java.io.FileReader;
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

 Salida.exit("Ingrese las Asignaturas a inscribir");
 registro_asignaturas();
 Salida.exit_Asignatura(materias);
    }
public static void registro_estudiante() {
String nombre = Entrada.readText("Ingrese el nombre del Estudiante: ");
String codigo = Entrada.readText("Ingrese el codigo del Estudiante: ");
String correo = Entrada.readText("Ingrese el correo del Estudiante: ");
int semestre = Entrada.readInt("Ingrese el semestre: ");
Estudiante estudian = new Estudiante(nombre,codigo,correo,semestre);
registr.add(new Registro(estudian));
    }
    public static void registro_asignaturas() {
int creditos= 0;
int creditostemp=0;
String preg;
while(creditos<5){
int codigo = Entrada.readInt("Ingrese el codigo de la asignatura: ");Entrada.crc();
String nombre_asignatura = Entrada.readText("Ingrese el nombre de la asignatura:");
int semestre = Entrada.readInt("Ingrese el semestre en el que esta: ");Entrada.crc();
int numero_credito = Entrada.readInt("Ingrese el numero de creditos: ");Entrada.crc();
String horar = Entrada.readText("Ingrese el horario: ");
materias.add(new Asignatura(codigo,nombre_asignatura,semestre,numero_credito,horar));
creditos=creditos+numero_credito;
}
if(creditos>=5){
    preg = Entrada.readText("Ya inscribio el minimo de 5 creditos,¿Continuar?");
    if(preg.equalsIgnoreCase("si")){
    while(creditos<16){
    creditostemp=creditos;
    int codigo = Entrada.readInt("Ingrese el codigo de la asignatura: ");Entrada.crc();
String nombre_asignatura = Entrada.readText("Ingrese el nombre de la asignatura:");
int semestre = Entrada.readInt("Ingrese el semestre en el que esta: ");Entrada.crc();
int numero_credito = Entrada.readInt("Ingrese el numero de creditos: ");Entrada.crc();
String horar = Entrada.readText("Ingrese el horario: ");
creditos=creditos+numero_credito;
for(Asignatura temp : materias){
if(!horar.equalsIgnoreCase(temp.getHorario())){
materias.add(new Asignatura(codigo,nombre_asignatura,semestre,numero_credito,horar));
break;

}if(horar.equalsIgnoreCase(temp.getHorario())){
System.out.println("Horario inscrito anteriormente");
creditos=creditostemp;
}
}
    }
    
    }else{
    
    }
}
    }
    public static void reporte_rgs_final(){
    }
    public static void lec_archivo(){
    FileReader archi;
    BufferedReader lector;
    String mensaje= "",lec;
    
    try{
    archi = new FileReader("C:\\Users\\DavidLeon\\Documents\\NetBeansProjects\\laboratorio3\\src\\main\\java\\asignaturas.txt");
    if(archi.ready()){
    lector = new BufferedReader(archi);
    while((lec=lector.readLine())!=null){
    mensaje = mensaje+lec+"\n";
    }
    }else{
    System.out.println("El archivo no esta listo para ser leido");
    }
    }catch(Exception e){
    System.out.println(e.getMessage());
    
    }
    System.out.println(mensaje);
    }
    public static void exit_Asignatura(){
    for(Asignatura asignatura : materias){
    System.out.println("Asignatura: "+asignatura.getCodigo());
    }
    }
}
