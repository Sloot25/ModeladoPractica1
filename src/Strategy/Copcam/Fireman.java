package src.Strategy.Nientiendo;
import Strategy.AtaqueCopcam;
import Strategy.Meganman;
import Strategy.Personaje;

public class Fireman extends Meganman{
  public String atacar(Personaje personaje){
    personaje.setVida(personaje.getVida()-30);
    return "Fireman disparo fuego a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';  
  }
}
