package Strategy.Chinpokomon;
import Observer.Arena;
import Strategy.Dittu;
import Strategy.Personaje;
public class Arceus extends Dittu{
  public Arceus(Arena arena) {
    super(arena);
  }

  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-100);
    return "Arceus ha usado canto mortal " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}

