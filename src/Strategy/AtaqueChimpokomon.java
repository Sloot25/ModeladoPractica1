package Strategy;

// Interfaz para los ataques especiales de Dittu
public interface AtaqueChimpokomon {

  /* Metodo que realiza la accion de atacar a un personaje con ataques de Chimpokomon, restandole puntos de vida 
   *
   * @param Personaje personaje: Recibe el personaje que sera atacado
   * @return Regresa un String con la accion realizada por el personaje
   *
   */

  public String atacar(Personaje personaje );
}
