package src.Observer;
import java.util.Random; 


public class User implements Observer{
  Arena arena; 
  String nombre;
  // Personaje personaje; Hay que descomentarla cuando terminemos la clase de Strategy
  public User(String nombre, Personaje personaje, Arena arena){
    this.nombre = nombre; 
    this.personaje = personaje; 
    this.arena = arena; 
  }

  public User(Personaje personaje, Arena arena){
    this.arena = arena; 
    this.personaje = personaje; 
    Random rnd = new Random();
    this.nombre = String.valueOf(rnd.nextInt(100));
  }
  
}
