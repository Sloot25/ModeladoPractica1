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
    int vida = (personaje.getVida()-30 < 0) ? 0 : personaje.getVida()-30;
    personaje.setVida(vida);
    return "Fireman disparo fuego a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}
