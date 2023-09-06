package Strategy.Chinpokomon;
import Observer.Arena;
import Strategy.Dittu;
import Strategy.Personaje;
import Strategy.AtaqueChimpokomon;

public class Voltorb implements AtaqueChimpokomon{
  
  /*
   * Metodo de una de las transformaciones de Dittu, actualiza el atributo vida del personaje atacado 
   * y regresa su leyenda correpondiente
   * 
   * @param personaje: personaje que sera atacado por Dittu
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante
   */
  public Voltorb(){}
    public String atacar(Personaje personaje){
      personaje.setVida(personaje.getVida()-50);
      return "Voltorb ha explotado " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}
