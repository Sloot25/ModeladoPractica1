import java.util.Random; 
import Strategy.Personaje;
import Strategy.Dittu;
import Strategy.Korby;
import Strategy.Meganman;
import Observer.Arena;
import Observer.User;
import Strategy.*; 
import Observer.*;
public class Main {
  public static void main(String[] args) {
    Arena arena = new Arena();
    Observer pepito = new User("Pepito", new Korby(), arena);
    Observer panchito = new User("Panchito", new Dittu(), arena);
    Observer jaimito = new User("Jaimito", new Meganman(), arena);
    Observer rubiocai = new User("Rubiocai", new Korby(), arena);
    arena.addUser(pepito);
    arena.addUser(panchito);
    arena.addUser(jaimito);
    arena.addUser(rubiocai);
    arena.combate3();

  }
}
