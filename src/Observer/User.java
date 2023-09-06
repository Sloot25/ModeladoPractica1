/*
 * Observador concreto
 * 
 * Clase encargada de recibir notificaciones por parte del sujeto (clase Arena)
 */


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

  /*
   * Constructor que además genera un archivo .txt con el nombre del usuario
   * que sera su bitacora e inicializa los atributos
   * 
   * @param nombre: indica el nombre del usuario
   * @param personaje: recibe un objeto de tipo Personaje, (Korby, Dittu, Meganman) 
   * @param arena: objeto proveniente de la clase Sujeto
   */

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
 
  /*
   * Constructor que además genera un archivo .txt con un nombre de usuario aleatorio e inicializa los atributos
   * 
   * @param personaje: recibe un objeto de tipo Personaje, (Korby, Dittu, Meganman) 
   * @param arena: objeto proveniente de la clase Sujeto
   */

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

  /*
   * Metodo encargado de imprimir el mensaje que recibe, ademas de 
   * 
   * @param mensaje: Texto que se actualiza por cada accion/notificacion de un personaje
   */
  @Override
  public void update(String mensaje) {
    try{
      if(mensaje.contains(personaje.getNombre() + " ha ganado el combate"))
        mensaje += "Tu personaje ha ganado el combate\n";
      else if(mensaje.contains(personaje.getNombre() + " se ha quedado sin vida"))
        mensaje += "Tu personaje ha muerto\n" + "Tu personaje ha perdido el combate\n";
      pw.write(mensaje);
    }catch(Exception e){
      System.err.println("Error al escribir mensaje");
    }
  }

  /*
   * Cierra el archivo
   */
  public void closeFichero(){
    try{
      this.pw.close();
    }catch(Exception e){
      System.err.println("Error al cerrar el archivo");
    }
  }
  

}
