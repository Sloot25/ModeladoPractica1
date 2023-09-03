package src.Strategy;
import Chinpokomon.*;
public class Korby extends Personaje implements AtaqueNientiendo {
  AtaqueNientiendo ataque;  
  Arena arena; 

  public Korby(Arena arena){
    this.vida = 100; 
    this.nombre = "Korby";
  }

  @Override
  public void ataqueBase(Personaje personaje) {
    personaje.setVida(personaje.getVida()-10); 
    return "Korby le dio un sape a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }

  @Override
  public void setAtaque(AtaqueNientiendo ataque) {
    this.ataque = ataque;
  }

  @Override
  public void powerUp(int numero) {
    switch(numero){
      case 0: 
        this.ataque = new  Fireman();
        break; 
      case 1: 
        this.ataque = new Iceman();
        break; 
      case 2: 
        this.ataque = new KingDedede();
        break;
    }
  }

  @Override
  public void ataque(Personaje personaje) {
    return this.ataque.atacar(Personaje personaje);
  }
    
}
