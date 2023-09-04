package Strategy.Copcam;
import Observer.Arena;
import Strategy.Meganman;
import Strategy.Personaje;
import Strategy.AtaqueCopcam;

public class Fireman implements AtaqueCopcam {
  /*
  public Fireman(Arena arena) {
    super(arena);
  }
  */
  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-30);
    return "Fireman disparo fuego a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}
