package Strategy.Nientiendo;
import Observer.Arena;
import Strategy.Korby;
import Strategy.Personaje;

public class VoidTermina extends Korby{
  public VoidTermina(Arena arena) {
    super(arena);
  }

  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-90);
    return "Void Termina ha atacado con un rayo laser a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
