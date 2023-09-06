package Strategy.Copcam;
import Observer.Arena;
import Strategy.Meganman;
import Strategy.Personaje;
import Strategy.AtaqueCopcam;
public class Iceman implements AtaqueCopcam{
  
  /*
   * Metodo de una de las transformaciones de Meganman, actualiza el atributo vida del personaje atacado 
   * y regresa su leyenda correpondiente
   * 
   * @param personaje: personaje que sera atacado por Meganman
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante
   */
  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-30);
    return "Iceman congelo a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
