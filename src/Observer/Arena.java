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
   * @param String mensaje: mensaje a actualizar de los observadores
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
   * CombateDos, incluye la lista de metodos que ejecutan los personajes durante el combate 
   * El combate es ganado por meganman
   * Al finalizar el combate cierra los archivo txt
   */

  public void combateDos(){
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

  /*
   * CombateTres, incluye la lista de metodos que ejecutan los personajes durante el combate 
   * El combate es ganado por meganman
   * Al finalizar el combate cierra los archivo txt
   */

  public void combateTres(){
    Personaje korby = new Korby();
    Personaje meganman = new Meganman();
    Personaje dittu = new Dittu();
    notifyUser(korby.ataqueBase(dittu));
    notifyUser(dittu.ataqueBase(meganman));
    notifyUser(korby.ataqueBase(meganman));
    notifyUser(dittu.ataqueBase(meganman));
    notifyUser(dittu.ataqueBase(korby));
    notifyUser(meganman.ataqueBase(korby));
    notifyUser(dittu.ataqueBase(korby));
    notifyUser(meganman.ataqueBase(dittu));
    notifyUser(korby.ataqueBase(dittu));
    notifyUser(meganman.ataqueBase(dittu));
    notifyUser(korby.powerUp(0));
    notifyUser(meganman.powerUp(0));
    notifyUser(korby.ataque(dittu));
    notifyUser(meganman.ataque(dittu));
    notifyUser(dittu.powerUp(0));
    notifyUser(dittu.ataque(meganman));
    notifyUser(dittu.ataque(korby));
    notifyUser(dittu.ganoCombate());
    notifyUser(combateFinalizado());
    closeFicheros();
  }

  /*
   * Combate, incluye la lista de metodos que ejecutan los personajes durante el combate 
   * El combate es ganado por dittu
   * Al finalizar el combate cierra los archivo txt
   */

  public void combate(){
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

  private String combateFinalizado(){
    return "El combate ha finalizado\n";
  }


}
