package Observer;

// interfaz que sera implementada por la clase Arena
public interface Subject{
  public void addUser(Observer user);
  public void removeUser(Observer user);
  public void notifyUser(String mensaje); 
}
