
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DavidLeon
 */
class Registro {
    Estudiante estudiante;
    Asignatura asigna;
    LinkedList<String> listAsignatura;
    
    Registro(Estudiante estudiante){
    this.estudiante=estudiante;
    listAsignatura = new LinkedList<>();
    }
}
