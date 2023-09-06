package Observer;
import java.util.ArrayList;
import Observer.User;
import Strategy.Korby; 
import Strategy.Meganman;
import Strategy.Dittu;
import Strategy.Personaje;
public class Arena implements Subject{
  ArrayList<Observer> usuarios;
  private String combateString;
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
  private void closeFicheros(){
    for(Observer user : usuarios)
      ((User)user).closeFichero();
  }

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
  private String combateFinalizado(){
    return "El combate ha finalizado\n";
  }
}
