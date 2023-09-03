package Strategy.Chinpokomon;
import Observer.Arena;
import Strategy.Dittu;
import Strategy.Personaje;

public class Voltorb extends Dittu{
  public Voltorb(Arena arena) {
    super(arena);
  }

    public String atacar(Personaje personaje){
      personaje.setVida(personaje.getVida()-50);
      return "Voltorb ha explotado " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}
