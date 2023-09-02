import java.util.List;
package src.Observer;
public class Arena implements Subject{
  List<Observer> usuarios;
  String notificacion;
  public void addUser(Observer user){
    usuarios.add(user);
  }
  public void removeUser(Observer user){
    usuarios.remove(user);
  }
  public void notifyUser(String mensaje){
    for(Observer user : usuarios)
      user.update(mensaje);
  }
}
