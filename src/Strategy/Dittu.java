package Strategy;
import Observer.Arena;
import Strategy.Chinpokomon.Arceus;
import Strategy.Chinpokomon.Snorlax;
import Strategy.Chinpokomon.Voltorb;
import Strategy.AtaqueChimpokomon;
public class Dittu extends Personaje{
  AtaqueChimpokomon ataque;
  public Dittu(){
    this.nombre = "Dittu";
    this.vida = 110;
  }

  /*
   * Especifica el ataquebase, actualiza la vida del personaje atacado
   * 
   * @param personaje: personaje atacado por Dittu
   * 
   * @return leyenda que indica el nombre del personaje y la vida restante 
   */
  @Override
  public String ataqueBase(Personaje personaje) {
    personaje.setVida(personaje.getVida()-10);
    return "Dittu le ha escupido a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n'+ estaVivo(personaje);
  }
/*
  @Override
  public void setAtaque(Ataque ataque) throws Exception {
    if(!(ataque instanceof AtaqueChimpokomon))
      throw new Exception("Error en transformación de Dittu");
    this.ataque = (AtaqueChimpokomon) ataque;
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
        this.ataque = new Arceus();
        return "Dittu se transformo en Arceus\n";
      case 1: 
        this.ataque = new Snorlax();
        return "Dittu se transformo en Snorlax\n";
      case 2: 
        this.ataque = new Voltorb();
        return "Dittu se transformo en Voltorb\n";
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
