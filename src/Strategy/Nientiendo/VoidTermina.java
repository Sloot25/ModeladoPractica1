package Strategy.Nientiendo;
import Observer.Arena;
import Strategy.Korby;
import Strategy.Personaje;
import Strategy.AtaqueNientiendo;
public class VoidTermina implements AtaqueNientiendo{
  
  /*
   * Metodo de una de las transformaciones de Korby, actualiza el atributo vida del personaje atacado 
   * y regresa su leyenda correpondiente
   * 
   * @param personaje: personaje que sera atacado por Korby
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante
   */
  public String atacar(Personaje personaje){
    int vida = (personaje.getVida()-90 < 0 ) ? 0 : personaje.getVida()-90;
    personaje.setVida(vida);
    return "Void Termina ha atacado con un rayo laser a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
