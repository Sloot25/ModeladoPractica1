package Strategy.Nientiendo;
import Observer.Arena;
import Strategy.Personaje;
import Strategy.Korby;
import Strategy.AtaqueNientiendo;
public class KingDedede implements AtaqueNientiendo{

  /*
   * Metodo de una de las transformaciones de Korby, actualiza el atributo vida del personaje atacado 
   * y regresa su leyenda correpondiente
   * 
   * @param personaje: personaje que sera atacado por Korby
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante
   */
  public String atacar(Personaje personaje){
    int vida = (personaje.getVida()-20 < 0) ? 0 : personaje.getVida()-20;
    personaje.setVida(vida);
    return "King Dedede le ha metido un martillazo a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
