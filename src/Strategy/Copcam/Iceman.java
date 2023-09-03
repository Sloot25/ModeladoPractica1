package Strategy.Copcam;
import Observer.Arena;
import Strategy.Meganman;
import Strategy.Personaje;
public class Iceman extends Meganman{
  public Iceman(Arena arena) {
    super(arena);
  }

  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-30);
    return "Iceman congelo a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
