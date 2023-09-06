/*
 * Sujeto concreto concreto
 * 
 * Clase encargada de actualizar el entorno (la arena de combate) y notificar a los personajes
 */
package Observer;
import java.util.ArrayList;
import Observer.User;
import Strategy.Korby; 
import Strategy.Meganman;
import Strategy.Dittu;
import Strategy.Personaje;
public class Arena implements Subject{
  ArrayList<Observer> usuarios;
  public Arena(){
    this.usuarios = new ArrayList<Observer>();
  }
  public void addUser(Observer user){
    usuarios.add(user);
  }
  public void removeUser(Observer user){
    usuarios.remove(user);
  }

  /*
   * Metodo encargado de notificar a todos los observadores
   * 
   * @param mensaje: mensaje a actualizar de los observadores
   */
  @Override
  public void notifyUser(String mensaje){
    for(Observer user : usuarios)
      user.update(mensaje);
  }

  /*
   * Cierra el archivo txt de todos los observadores
   */
  public void closeFicheros(){
    for(Observer user : usuarios)
      ((User)user).closeFichero();
  }

  /*
   * Combates disponibles, incluye la lista de metodos que ejecutan los personajes.
   * Al finalizar el combate cierra los archivo txt
   */

  public void combate2(){
    Personaje korby = new Korby();
    Personaje meganman = new Meganman();
    Personaje dittu = new Dittu();

    for(int i = 0; i < 10; i++){
      notifyUser(korby.ataqueBase(meganman));
      notifyUser(meganman.ataqueBase(dittu));
      notifyUser(dittu.ataqueBase(korby));
    }
    notifyUser(meganman.ataqueBase(dittu));
    notifyUser(dittu.ataqueBase(meganman));
    notifyUser(meganman.ataqueBase(dittu));
    notifyUser(meganman.ganoCombate());
    notifyUser(combateFinalizado());
    closeFicheros();
  }

  public void combate3(){
    Personaje korby = new Korby();
    Personaje meganman = new Meganman();
    Personaje dittu = new Dittu();
    notifyUser(korby.ataqueBase(meganman));
    notifyUser(dittu.ataqueBase(meganman));
    notifyUser(korby.ataqueBase(meganman));
    notifyUser(dittu.ataqueBase(meganman));
    notifyUser(korby.ataqueBase(meganman));
    notifyUser(korby.powerUp(0));
    notifyUser(meganman.powerUp(0));
    notifyUser(korby.ataque(dittu));
    notifyUser(meganman.ataque(dittu));
    notifyUser(korby.ataque(dittu));
    notifyUser(meganman.ataque(dittu));
    notifyUser(korby.ataque(dittu));
    notifyUser(meganman.ataque(dittu));
    notifyUser(korby.ataque(dittu));
    notifyUser(meganman.ataque(dittu));
    notifyUser(korby.ataque(dittu));
    notifyUser(meganman.ataque(dittu));
    notifyUser(korby.ataque(dittu));
    notifyUser(meganman.ataque(dittu));
    notifyUser(korby.powerUp(2));
    notifyUser(dittu.powerUp(2));
    notifyUser(korby.ataque(meganman));
    notifyUser(dittu.ataque(meganman));
    notifyUser(korby.ataque(meganman));
    notifyUser(dittu.ataque(meganman));
    notifyUser(korby.ataque(meganman));
    notifyUser(dittu.ataque(meganman));
    notifyUser(combateFinalizado());
    closeFicheros();
  }
  public void combate4(){
    Personaje korby = new Korby();
    Personaje meganman = new Meganman();
    Personaje dittu = new Dittu();
    notifyUser(dittu.powerUp(0));
    notifyUser(dittu.ataque(korby));
    notifyUser(dittu.ataque(meganman));
    notifyUser(dittu.ataque(meganman));
    notifyUser(dittu.ganoCombate());
    notifyUser(combateFinalizado());
    closeFicheros();
  }

}
