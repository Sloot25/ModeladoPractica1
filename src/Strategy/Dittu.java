package src.Strategy;
import Nientiendo.*;
import src.Observer.Arena;

public class Dittu extends Personaje implements AtaqueChimpokomon{
  AtaqueChimpokomon ataque;
  Arena arena;
  public Dittu(Arena arena){
    this.arena = arena; 
    this.nombre = "Dittu";
    this.vida = 110;
  }

  @Override
  public String ataqueBase(Personaje personaje) {
    personaje.setVida(personaje.getVida()-10);
    return "Dittu le ha escupido a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }

  @Override
  public void setAtaque(AtaqueChimpokomon ataque) {
    this.ataque = ataque;
  }

  @Override
  public void powerUp(int numero) {
    switch(numero){
      case 0: 
        this.ataque = new Arceus();
        break; 
      case 1: 
        this.ataque = new Snorlax();
        break; 
      case 2: 
        this.ataque = new Voltorb();
        break;
    }
  }

  @Override
  public String ataque(Personaje personaje) {
    return this.ataque.atacar(personaje);
  }
    
}
