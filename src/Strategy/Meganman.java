package src.Strategy;
import Copcam.*;
public class Meganman extends Personaje implements AtaqueCopcam{
  AtaqueCopcam ataque;
  public Meganman(Arena arena){
    this.nombre = "Meganman";
    this.arena = arena; 
    this.vida = 120;
  }

  @Override
  public String ataqueBase(Personaje personaje) {
    personaje.setVida(personaje.getVida()-10);
    return "Meganman disparo balitas a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }

  @Override
  public void setAtaque(AtaqueCopcam ataque) {
    this.ataque = ataque;
  }

  @Override
  public void powerUp(int numero) {
    switch (numero) {
      case 0:
        this.ataque = new Gutsman();
        break;
      case 1: 
        this.ataque = new VoidTermina();
        break;
      case 2: 
        this.ataque = new Zero();
    }
  }

  @Override
  public String ataque(Personaje personaje) {
    return this.ataque.atacar(personaje);
  }
  
}
