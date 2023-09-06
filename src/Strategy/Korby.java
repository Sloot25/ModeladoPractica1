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

  /*
   * Especifica el ataquebase, actualiza la vida del personaje atacado
   * 
   * @param personaje: personaje atacado por Korby
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante 
   */
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

  /*
   * Modifica el ataque de acuerdo a la transformacion indicada
   * 
   * @param numero: clave de la transformacion
   * 
   * @return leyenda que indica en que se transformo 
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
