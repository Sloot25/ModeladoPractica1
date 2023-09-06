package Strategy.Chinpokomon;
import Observer.Arena;
import Strategy.Dittu;
import Strategy.Personaje;
import Strategy.AtaqueChimpokomon;

public class Voltorb implements AtaqueChimpokomon{
  /*
  public Voltorb(Arena arena) {
    super(arena);
  }
*/
  public Voltorb(){}
    public String atacar(Personaje personaje){
      int vida = (personaje.getVida() -  50 < 0) ? 0 : personaje.getVida() - 50;
      personaje.setVida(vida);
      return "Voltorb ha explotado " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}
