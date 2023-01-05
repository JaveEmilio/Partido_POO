public class Portero extends Jugador {
    public Portero(int dorsalJugador, EstadoDelJugador estadoDelJugador, boolean estadoDePoseciónDelBalón) {
        super(dorsalJugador,estadoDelJugador,estadoDePoseciónDelBalón);
    }

    @Override
    public boolean tuvoAccionesRelevantes() {
        int accionesRelevantes = (int)(Math.random()*5);
        return (accionesRelevantes<3) ? false : true;
    }
}
