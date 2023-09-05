package Observer;
import java.util.Random;
import Strategy.Personaje; 
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class User implements Observer{
  Arena arena; 
  String nombre;
  Personaje personaje;
  BufferedWriter bf;
  PrintWriter pw;
  FileWriter fw;
  String mensaje;
  public User(String nombre, Personaje personaje, Arena arena){
    this.nombre = nombre; 
    this.personaje = personaje; 
    this.arena = arena; 
    mensaje ="";
    try{
      this.fw = new FileWriter(nombre+".txt");
      this.pw = new PrintWriter(fw);
      this.pw.write("Has seleccionado a "+ personaje.getNombre() + '\n');
    }catch(Exception e){
      System.err.println("Error al escribir el fichero");
    }
  }

  public User(Personaje personaje, Arena arena){
    this.arena = arena; 
    this.personaje = personaje; 
    Random rnd = new Random();
    this.nombre = String.valueOf(rnd.nextInt(100));
    mensaje = "";
    try{
      this.fw = new FileWriter(nombre+".txt");
      this.pw = new PrintWriter(fw);
      this.pw.write("Has seleccionado a "+ personaje.getNombre() + '\n');
    }catch(Exception e){
      System.err.println("Error al escribir el fichero");
    }
  }

  @Override
  public void update(String mensaje) {
    try{
      System.out.println(mensaje);
      if(mensaje.contains(personaje.getNombre() + " ha ganado el combate")){
        mensaje += "Tu personaje ha ganado el combate\n";
      } else if(mensaje.contains(personaje.getNombre() + " se ha quedado sin vida"))
        mensaje += "Tu personaje ha muerto\n";
      pw.write(mensaje);
    }catch(Exception e){
      System.err.println("Error al escribir mensaje");
    }

  }
  public void closeFichero(){
    try{
      this.pw.close();
    }catch(Exception e){
      System.err.println("Error al cerrar el archivo");
    }
  }
  
}
