public class Volante extends Jugador{
    public Volante(int dorsalJugador, EstadoDelJugador estadoDelJugador, boolean estadoDePoseciónDelBalón) {
        super(dorsalJugador,estadoDelJugador,estadoDePoseciónDelBalón);
    }

    @Override
    public boolean tuvoAccionesRelevantes() {
        int accionesRelevantes = (int)(Math.random()*7);
        return (accionesRelevantes<4) ? false : true;
    }
}
