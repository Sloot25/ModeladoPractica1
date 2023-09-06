package Strategy;

import Observer.Arena;
import Strategy.Nientiendo.MetaKnight;
import Strategy.Nientiendo.VoidTermina;
import Strategy.Nientiendo.KingDedede;
import Strategy.AtaqueNientiendo;
public class Korby extends Personaje {
  AtaqueNientiendo ataque;  

  public Korby(){
    this.vida = 100; 
    this.nombre = "Korby";
  }

  @Override
  public String ataqueBase(Personaje personaje) {
    int vida = (personaje.getVida()-10 < 0) ? 0 : personaje.getVida()-10;
    personaje.setVida(vida); 
    return "Korby le dio un sape a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n' + estaVivo(personaje);
  }
/*
  @Override
  public void setAtaque(Ataque ataque) throws Exception {
    if(!(ataque instanceof AtaqueNientiendo))
      throw new Exception("Error en transformación de Dittu");
    this.ataque = (AtaqueNientiendo) ataque;
  }
*/
  @Override
  public String powerUp(int numero) {
    switch(numero){
      case 0: 
        this.ataque =  new MetaKnight();
        return "Korby se comio a MetaKnight\n";
      case 1: 
        this.ataque =  new VoidTermina();
        return "Korby se comio a VoidTermina\n";
      case 2: 
        this.ataque = new KingDedede();
        return "Korby se comio a KingDedede\n";
    }
    return "";
  }

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
