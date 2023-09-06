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
  public String estaVivo(Personaje personaje){
    if(personaje.getVida() > 0) 
      return "";
    else 
      return personaje.getNombre() + " se ha quedado sin vida\n";
  }
  public String ganoCombate(){
    return getNombre() + " ha ganado el combate\n";
  }
  abstract public String ataqueBase(Personaje personaje); //abstract public void setAtaque(Ataque ataque) throws Exception;
  abstract public String powerUp(int numero);
  abstract public String ataque(Personaje personaje);
}
