package Strategy.Nientiendo;
import Observer.Arena;
import Strategy.Korby;
import Strategy.Personaje;
import Strategy.AtaqueNientiendo;
public class MetaKnight implements AtaqueNientiendo{
  /*
  public MetaKnight(Arena arena) {
    super(arena);
  }
*/
  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-30);
    return "Meta Knight ha cortado con su espada a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
