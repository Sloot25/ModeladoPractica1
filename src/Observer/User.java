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
  // Personaje personaje; Hay que descomentarla cuando terminemos la clase de Strategy
  public User(String nombre, Personaje personaje, Arena arena){
    this.nombre = nombre; 
    this.personaje = personaje; 
    this.arena = arena; 
    mensaje ="";
    try{
      this.fw = new FileWriter(nombre+".txt");
      this.bf = new BufferedWriter(new FileWriter(nombre+".txt"));
      this.pw = new PrintWriter(fw);
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
    this.bf = new BufferedWriter(new FileWriter(nombre+".txt"));
      this.pw = new PrintWriter(new FileWriter(nombre+".txt"));
    }catch(Exception e){
      System.err.println("Error al escribir el fichero");
    }
  }

  @Override
  public void update(String mensaje) {
    try{
      System.out.println(mensaje);
      pw.write(mensaje);
    }catch(Exception e){
      System.err.println("Error al escribir mensaje");
    }

  }
  public void closeFichero(){
    try{
      this.fw.close();
    }catch(Exception e){
      System.err.println("Error al cerrar el archivo");
    }
  }
  
}
