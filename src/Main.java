import java.util.Random; 
import Strategy.*; 
import Observer.*;
public class Main {

  /* Este metodo es el principal y se encarga de la ejecucion del programa a traves de un random para 
   * elegir de forma aleatoria el combate a realizar
   *
   */
  public static void main(String[] args) {
    Arena arena = new Arena();
    Random random = new Random();
    int x = random.nextInt(3);
    Observer pepito = new User("Pepito", new Korby(), arena);
    Observer panchito = new User("Panchito", new Dittu(), arena);
    Observer jaimito = new User("Jaimito", new Meganman(), arena);
    Observer rubiocai = new User("Rubiocai", new Korby(), arena);
    arena.addUser(pepito);
    arena.addUser(panchito);
    arena.addUser(jaimito);
    arena.addUser(rubiocai);
    switch(x){
      case 0:
        arena.combate();
      case 1:
        arena.combateDos();
      case 2:
        arena.combateTres();
    }
  }
}
