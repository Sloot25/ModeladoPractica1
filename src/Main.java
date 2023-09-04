import java.util.Random; 
import Strategy.Personaje;
import Strategy.Dittu;
import Strategy.Korby;
import Strategy.Meganman;
import Observer.Arena;
import Observer.User;

public class Main {
  public static void main(String[] args) {
    Subject arena = new Arena();
    Observer pepito = new User("Pepito", new Korby());
    Observer panchito = new User("Panchito", new Dittu());
    Observer jaimito = new User("Jaimito", new Meganman());
    Observer rubiocai = new User("Rubiocai", new Korby());
    arena.addUser(pepito);
    arena.addUser(panchito);
    arena.addUser(jaimito);
    arena.addUser(rubiocai);
    arena.combate();

  }
}
