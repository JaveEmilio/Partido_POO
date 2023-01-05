public abstract class Jugador {
    private int dorsal;
    private EstadoDelJugador estadoDelJugador;
    private boolean estadoDelBalon;

    public Jugador(int dorsal, EstadoDelJugador estadoDelJugador, boolean estadoDelBalon) {
        this.dorsal = dorsal;
        this.estadoDelJugador = estadoDelJugador;
        this.estadoDelBalon = estadoDelBalon;
    }

    public boolean estaEnCancha() {
        if(estadoDelJugador != EstadoDelJugador.TITULAR){
            return false;
        }
        return true;
    }


    public abstract boolean tuvoAccionesRelevantes();
}
