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
    int vida = (personaje.getVida()-30<0) ? 0 : personaje.getVida()-30;
    personaje.setVida(vida);
    return "Meta Knight ha cortado con su espada a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
