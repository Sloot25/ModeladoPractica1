package Strategy.Chinpokomon;
import Observer.Arena;
import Strategy.Dittu;
import Strategy.Personaje;
import Strategy.AtaqueChimpokomon;
public class Arceus implements AtaqueChimpokomon{

  /*
   * Metodo de una de las transformaciones de Dittu, actualiza el atributo vida del personaje atacado 
   * y regresa su leyenda correpondiente
   * 
   * @param personaje: personaje que sera atacado por Dittu
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante
   */
  public String atacar(Personaje personaje){
    int vida = (personaje.getVida() - 100 < 0) ? 0 : personaje.getVida() - 100; 
    personaje.setVida(vida);
    return "Arceus ha usado canto mortal " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}

