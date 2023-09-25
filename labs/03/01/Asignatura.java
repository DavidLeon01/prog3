/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DavidLeon
 */
class Asignatura {

    int codigo;
    String nombre;
    int semestre;
    int numero_creditos;
    String horario;
    
    public Asignatura(int codigo, String nombre, int semestre, int numero_creditos, String horario){
    this.codigo= codigo;
    this.nombre= nombre;
    this.semestre=semestre;
    this.numero_creditos = numero_creditos;
    this.horario=horario;
    }
    
    public int getCodigo(){
    return codigo;
    }
      public void setCodigo(int codigo){
    this.codigo=codigo;
    }
       public String getNombre(){
    return nombre;
    }
      public void setNombre(String nombre){
    this.nombre=nombre;
    }
       public int getSemestre(){
    return semestre;
    }
      public void setSemestre(int semestre){
    this.semestre=semestre;
    }
       public int getNumero_creditos(){
    return numero_creditos;
    }
      public void setNumero_creditos(int codigo){
    this.numero_creditos=numero_creditos;
    }
       public String getHorario(){
    return horario;
    }
      public void setHorario(String horario){
    this.horario=horario;
    }
}
