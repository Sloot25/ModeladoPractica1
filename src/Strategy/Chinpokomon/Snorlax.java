package Strategy.Chinpokomon;
import Observer.Arena;
import Strategy.Personaje;
import Strategy.Dittu;
import Strategy.AtaqueChimpokomon;
public class Snorlax implements AtaqueChimpokomon{

   /*
   * Metodo de una de las transformaciones de Dittu, actualiza el atributo vida del personaje atacado 
   * y regresa su leyenda correpondiente
   * 
   * @param personaje: personaje que sera atacado por Dittu
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante
   */
  public String atacar(Personaje personaje){
    return "Snorlax se ha dormido frente a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
