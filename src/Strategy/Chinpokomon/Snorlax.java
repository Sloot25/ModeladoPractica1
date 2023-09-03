package src.Strategy.Chinpokomon;
import Strategy.AtaqueChimpokomon;
import Strategy.Personaje;
import Strategy.Dittu;
public class Snorlax extends Dittu{
  public String atacar(Personaje personaje){
    return "Snorlax se ha dormido" + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
