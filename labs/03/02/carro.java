/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DavidLeon
 */
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Date;
public class carro {
   private String placa;
   private String tipo;
   private String IngresoP;
   private String SalidaP;
           
   public carro(String placa,String tipo,String IngresoP){
   this.placa=placa;
   this.tipo=tipo;
   this.IngresoP=IngresoP;
   }
   public String getPlaca(){
   return placa;
   }
   public void setPlaca(String placa){
   this.placa=placa;
   }
   public String getTipo(){
   return tipo;
   }
   public void setTipo(String tipo){
   this.tipo=tipo;
   }
   public String getingresoP(){
   return IngresoP;
   }
   public void setingresoP(String IngresoP){
   this.IngresoP=IngresoP;
   }
   public String getsalidaP(){
   return SalidaP;
   }
   public void setgetsalidaP(String SalidaP){
   this.SalidaP=SalidaP;
       }
   
}
