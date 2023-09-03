package Strategy;

public abstract class Personaje {
    String nombre;
    int vida;
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
    abstract public void ataqueBase(Personaje personaje);
    abstract public void setAtaque();
    abstract public void powerUp();
}
