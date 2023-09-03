package Strategy;

import Observer.Arena;
import Strategy.Nientiendo.MetaKnight;
import Strategy.Nientiendo.VoidTermina;
import Strategy.Nientiendo.KingDedede;

public class Korby extends Personaje implements AtaqueNientiendo {
  AtaqueNientiendo ataque;  
  Arena arena; 

  public Korby(Arena arena){
    this.vida = 100; 
    this.nombre = "Korby";
  }

  @Override
  public String ataqueBase(Personaje personaje) {
    personaje.setVida(personaje.getVida()-10); 
    return "Korby le dio un sape a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
  }

  @Override
  public void setAtaque(Ataque ataque) throws Exception {
    if(!(ataque instanceof AtaqueNientiendo))
      throw new Exception("Error en transformación de Dittu");
    this.ataque = (AtaqueNientiendo) ataque;
  }

  @Override
  public void powerUp(int numero) {
    switch(numero){
      case 0: 
        this.ataque = (AtaqueNientiendo) new MetaKnight(arena);
        break; 
      case 1: 
        this.ataque = (AtaqueNientiendo) new VoidTermina(arena);
        break; 
      case 2: 
        this.ataque = new KingDedede(arena);
        break;
    }
  }

  @Override
  public String ataque(Personaje personaje) {
    return this.ataque.atacar(personaje);
  }

  @Override
  public String atacar(Personaje personaje) {
    return ataqueBase(personaje);
  }
    
}
