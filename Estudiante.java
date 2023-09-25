/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DavidLeon
 */
public class Estudiante  {
 private String nombre;
  private String codigo;
   private String correo;
    private int semestre;
    public Estudiante(String nombre, String codigo, String correo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
    }
     public String getNombre(){
    return nombre;
    }
        public void SetNombre(String nombre){
    this.nombre= nombre;
    }
    public String getCodigo(){
    return codigo;
    }
     public void SetCodigo(String codigo){
    this.codigo= codigo;
    }
       public String getCorreo(){
    return correo;
    }
     public void SetCorreo(String correo){
    this.correo = correo;
    }
       public int getSemestre(){
    return semestre;
    }
     public void SetSemestre(String codigo){
    this.semestre = semestre;
    }
}
