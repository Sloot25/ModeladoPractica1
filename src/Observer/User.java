package Observer;
import java.util.Random;
import Strategy.Personaje; 
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class User implements Observer{
  Arena arena; 
  String nombre;
  Personaje personaje;
  BufferedWriter bf;
  // Personaje personaje; Hay que descomentarla cuando terminemos la clase de Strategy
  public User(String nombre, Personaje personaje, Arena arena){
    this.nombre = nombre; 
    this.personaje = personaje; 
    this.arena = arena; 
    try{
      this.bf = new BufferedWriter(new FileWriter(nombre+".txt"));
    }catch(Exception e){
      System.err.println("Error al escribir el fichero");
    }
  }

  public User(Personaje personaje, Arena arena){
    this.arena = arena; 
    this.personaje = personaje; 
    Random rnd = new Random();
    this.nombre = String.valueOf(rnd.nextInt(100));
    try{
    this.bf = new BufferedWriter(new FileWriter(nombre+".txt"));
    }catch(Exception e){
      System.err.println("Error al escribir el fichero");
    }
  }

  @Override
  public void update(String mensaje) {
    try{
    bf.write(a);
    }catch(Exception e){
      System.err.println("Error al escribir mensaje");
    }

  }
  public void closeFichero(){
    this.bf.close();
  }
  
}
