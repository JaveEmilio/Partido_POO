public class Defensa extends Jugador {

    public Defensa(int dorsalJugador, EstadoDelJugador estadoDelJugador, boolean estadoDePoseciónDelBalón) {
        super(dorsalJugador,estadoDelJugador,estadoDePoseciónDelBalón);
    }

    @Override
    public boolean tuvoAccionesRelevantes() {
        int accionesRelevantes = (int)(Math.random()*4);
        return (accionesRelevantes<2) ? false: true;
    }
}
