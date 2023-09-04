package Observer;
import java.util.List;
public class Arena implements Subject{
  List<Observer> usuarios;
  public Arena(){
    this.usuarios = new List<Observer>();
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
  public void combate(){
    Personaje kirby = new Kirby();
    Personaje meganman = new Meganman();
    Personaje dittu = new Dittu();

    notifyUser(kirby.ataquebase(meganman));
    notifyUser(meganman.ataquebase(dittu));
    notifyUser(dittu.ataquebase(meganman));
    notifyUser(dittu.powerup(2));
    notifyUser(dittu.ataque(kirby));
    notifyUser(kirby.powerup(1));
    notifyUser(kirby.ataque(meganman));

  }
}
