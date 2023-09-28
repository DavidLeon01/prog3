
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DavidLeon
 */
public class metodos {
    private final List<carro> listaCarros = new ArrayList<>();
public static void main(String[] args) {
new parqueadero1().setVisible(true);
}
public void ingresocarro(String placa,String tipo,String IngresoP){
    carro carro1 = new carro(placa,tipo,IngresoP);
    listaCarros.add(carro1);
}
public void salircarro(String vehiculosalir){
Iterator<carro>iter = listaCarros.iterator();
while(iter.hasNext()){
carro carro1 = iter.next();
if(carro1.getPlaca().equals(vehiculosalir)){
iter.remove();
}
}
}
public String buscarehiculo(String placabuscar){
for(carro carro1 : listaCarros){
if(carro1.getPlaca().equals(placabuscar)){
return carro1.toString();
}
    
}
return "Vehiculo no encontrado en la plataforma";
}
public List<carro> vehiculoxhoras(String inicio,String fin){
List<carro> carroe=new ArrayList<>();
SimpleDateFormat horaf = new SimpleDateFormat("HH:mm:ss");
try{
Date horaInicioDate = horaf.parse(inicio);
Date horaFinDate = horaf.parse(fin);
for (carro carro1 :listaCarros){
Date horaIngresoDate = horaf.parse(carro1.getingresoP());

if(horaIngresoDate.after(horaInicioDate)&& horaIngresoDate.before(horaFinDate)){
carroe.add(carro1);
}
}
}catch(ParseException e){
e.printStackTrace();
}
return carroe;
}




}

