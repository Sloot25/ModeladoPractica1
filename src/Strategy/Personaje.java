/*
 * Clase abstracta del que van a heredar los personajes del juego
 */

package Strategy;

import Observer.Arena;

public abstract class Personaje {
  protected String nombre;
  protected int vida;

  public String getNombre() {
      return nombre;
  }
  
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public int getVida() {
      return vida;
  }

  public void setVida(int vida) {
      this.vida = vida;
  }
  /*
   * Verifica la vida del personaje y arroja una leyenda en caso de que sea cero
   * 
   * @param personaje: checa la vida del personaje
   * 
   * @return leyenda en caso de que se haya quedadoo no sin vida
   */
  public String estaVivo(Personaje personaje){
    if(personaje.getVida() > 0) 
      return "";
    else 
      return personaje.getNombre() + " se ha quedado sin vida\n";
  }

   /*
   * Anuncia al personaje que recibe como ganador
   * 
   * @param personaje: personaje ganador
   * 
   * @return leyenda de que el personaje ha ganado
   */
  public String ganoCombate(Personaje personaje){
    return personaje.getNombre() + " ha ganado el combate";
  }

  abstract public String ataqueBase(Personaje personaje); //abstract public void setAtaque(Ataque ataque) throws Exception;
  abstract public String powerUp(int numero);
  abstract public String ataque(Personaje personaje);
}
