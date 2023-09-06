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

  /*
   * Especifica el ataquebase, actualiza la vida del personaje atacado
   * 
   * @param personaje: personaje atacado por Meganman
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante 
   */
  @Override
  public String ataqueBase(Personaje personaje) {
    personaje.setVida(personaje.getVida()-10);
    return "Meganman disparo balitas a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n' + estaVivo(personaje);
  }
/*
  @Override
  public void setAtaque(Ataque ataque) throws Exception {
    if(!(ataque instanceof AtaqueCopcam))
      throw new Exception("Error en transformación de Dittu");
    this.ataque = (AtaqueCopcam) ataque;
  }
*/

  /*
   * Modifica el ataque de acuerdo a la transformacion indicada
   * 
   * @param numero: clave de la transformacion
   * 
   * @return leyenda que indica en que se transformo 
   */
  @Override
  public String powerUp(int numero) {
    switch (numero) {
      case 0:
        this.ataque = new Gutsman();
        return "Menganman absorbio el poder de Gutsman\n";
      case 1: 
        this.ataque = new Fireman();
        return "Meganman absorbio el poder de Fireman\n";
      case 2: 
        this.ataque = new Iceman();
        return "Meganman absorbio el poder de Iceman\n";
    }
    return "";
  }

   /*
   * Ejecuta el ataque y verifica si esta vivo el personaje atacado 
   * 
   * @param personaje: personaje que sera atacado
   * 
   * @return leyenda que indica el personaje atacado, la vida restante y si murio cuando sea el caso 
   */
  @Override
  public String ataque(Personaje personaje) {
    return this.ataque.atacar(personaje) + this.estaVivo(personaje);
  }
/*
  @Override
  public String atacar(Personaje personaje) {
    return ataqueBase(personaje);
  }
  */
}
