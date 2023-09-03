package src.Strategy.Nientiendo;
import Strategy.AtaqueNientiendo;
import Strategy.Personaje;
import Strategy.Korby;

public class KingDedede extends Korby{
    public String atacar(Personaje personaje){
        personaje.setVida(personaje.getVida()-20);
        return "King Dedede le ha metido un martillazo a " + personaje.getNombre() + '\n' + "La vida actual de " + personaje.getNombre() + " es " + personaje.getVida() + '\n';
    }
}
