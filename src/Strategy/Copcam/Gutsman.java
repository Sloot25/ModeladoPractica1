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
    personaje.setVida(personaje.getVida()-30);
    return "Gutsman agarro a golpes a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}

