package src.Strategy.Nientiendo;
import Strategy.AtaqueNientiendo;
import Strategy.Korby;
import Strategy.Personaje;

public class MetaKnight extends Korby{
  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-30);
    return "Meta Knight ha cortado con su espada a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
}
