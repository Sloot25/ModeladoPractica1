package Strategy.Copcam;
import Observer.Arena;
import Strategy.Meganman;
import Strategy.Personaje;
import Strategy.AtaqueCopcam;
public class Gutsman implements AtaqueCopcam{
  /*
  public Gutsman(Arena arena) {
    super(arena);
  }
  */
  public String atacar(Personaje personaje){
    int vida = (personaje.getVida()-30 < 0) ? 0 : personaje.getVida()-30; 
    personaje.setVida(vida);
    return "Gutsman agarro a golpes a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}

