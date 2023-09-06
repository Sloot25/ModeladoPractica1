package Strategy;

// Interfaz para los ataques especiales de Korby
public interface AtaqueNientiendo{
  
  /* Metodo que realiza la accion de atacar a un personaje con ataques de Nientiendo, restandole puntos de vida 
   *
   * @param Personaje personaje: Recibe el personaje que sera atacado
   * @return Regresa un String con la accion realizada por el personaje
   *
   */

  public String atacar(Personaje personaje);
}
