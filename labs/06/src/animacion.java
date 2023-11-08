import java.awt.Dimension;
import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;


public class animacion  extends javax.swing.JLabel {   
    private Timer tiempo ;
    private TimerTask task;
    private int speed = 60;
    private int frame=1;
    boolean run = false;
    private int im;
    
   
    public animacion(Dimension d){        
        this.setSize(d);
    }  

    public void setimage(int n){ 
        int b = ((int)(Math.random()*9)+1);
        
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/figura" + b + ".png"))); 
        setim(b);
    }
   
    public void setvelocidad(int v){
        this.speed= v;        
    }
   
  public void startAnimation() {    
           run=true;
           tiempo = new Timer();
           task = new TimerTask() {               
               public void run() {
   
                   frame++;                   
                   if (frame<=9){
                 
                       
                        setimage(frame);
                   }
                   else{frame=1;}
               }
           };
           
           System.out.println("Se inicia la animacion");                                             
           tiempo.schedule(task,0,speed); 
    }
 
     public void stopAnimation() {        
        tiempo.cancel();
        task.cancel();
        run=false;
        System.out.println("La animacion fue detenida");                                             
    }

    public void setim(int a) {
        this.im = a;
    }
     

    
    public int getIm() {
        
        return im;
    }
     

}


