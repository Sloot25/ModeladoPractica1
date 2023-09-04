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
  @Override
  public void notifyUser(String mensaje){
    for(Observer user : usuarios)
      user.update(mensaje);
  }
  public void closeFicheros(){
    for(Observer user : usuarios)
      ((User)user).closeFichero();
  }
  public void combate(){
    Personaje kirby = new Korby();
    Personaje meganman = new Meganman();
    Personaje dittu = new Dittu();

    notifyUser(kirby.ataqueBase(meganman));
    notifyUser(meganman.ataqueBase(dittu));
    notifyUser(dittu.ataqueBase(meganman));

    notifyUser(dittu.powerUp(2));
    notifyUser(dittu.ataque(kirby));
    notifyUser(kirby.powerUp(1));
    notifyUser(kirby.ataque(meganman));
    closeFicheros();
  }
}
