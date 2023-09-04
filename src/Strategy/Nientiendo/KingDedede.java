package Strategy.Nientiendo;
import Observer.Arena;
import Strategy.Personaje;
import Strategy.Korby;
import Strategy.AtaqueNientiendo;
public class KingDedede implements AtaqueNientiendo{

  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-20);
    return "King Dedede le ha metido un martillazo a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
