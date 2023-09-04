package Strategy.Chinpokomon;
import Observer.Arena;
import Strategy.Personaje;
import Strategy.Dittu;
import Strategy.AtaqueChimpokomon;
public class Snorlax implements AtaqueChimpokomon{
  /*
  public Snorlax(Arena arena) {
    super(arena);
  }
*/
  public String atacar(Personaje personaje){
    return "Snorlax se ha dormido" + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
