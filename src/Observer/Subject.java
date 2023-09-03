package Observer;

public interface Subject{
  public void addUser(Observer user);
  public void removeUser(Observer user);
  public void notifyUser(); 
}
