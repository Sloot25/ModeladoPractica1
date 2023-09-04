package Strategy;
import Observer.Arena;
import Strategy.Chinpokomon.Arceus;
import Strategy.Chinpokomon.Snorlax;
import Strategy.Chinpokomon.Voltorb;
import Strategy.AtaqueChimpokomon;
public class Dittu extends Personaje{
  AtaqueChimpokomon ataque;
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
/*
  @Override
  public void setAtaque(Ataque ataque) throws Exception {
    if(!(ataque instanceof AtaqueChimpokomon))
      throw new Exception("Error en transformación de Dittu");
    this.ataque = (AtaqueChimpokomon) ataque;
  }
*/
  @Override
  public void powerUp(int numero) {
    switch(numero){
      case 0: 
        this.ataque = new Arceus(arena);
        break; 
      case 1: 
        this.ataque = new Snorlax(arena);
        break; 
      case 2: 
        this.ataque = new Voltorb(arena);
        break;
    }
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
