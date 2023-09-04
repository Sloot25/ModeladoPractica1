package Strategy;
import Strategy.Copcam.Fireman;
import Strategy.Copcam.Gutsman;
import Strategy.Copcam.Iceman;
import Strategy.AtaqueCopcam;
public class Meganman extends Personaje {
  AtaqueCopcam ataque;
  public Meganman(){
    this.nombre = "Meganman";
    this.vida = 120;
  }

  @Override
  public String ataqueBase(Personaje personaje) {
    personaje.setVida(personaje.getVida()-10);
    return "Meganman disparo balitas a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }
/*
  @Override
  public void setAtaque(Ataque ataque) throws Exception {
    if(!(ataque instanceof AtaqueCopcam))
      throw new Exception("Error en transformación de Dittu");
    this.ataque = (AtaqueCopcam) ataque;
  }
*/
  @Override
  public String powerUp(int numero) {
    switch (numero) {
      case 0:
        this.ataque = new Gutsman();
        return "Menganman absorbio el poder de Gutsman";
      case 1: 
        this.ataque = new Fireman();
        return "Meganman absorbio el poder de Fireman";
      case 2: 
        this.ataque = new Iceman();
        return "Meganman absorbio el poder de Iceman";
    }
    return "";
  }

  @Override
  public String ataque(Personaje personaje) {
    return this.ataque.atacar(personaje);
  }
/*
  @Override
  public String atacar(Personaje personaje) {
    return ataqueBase(personaje);
  }
  */
}
