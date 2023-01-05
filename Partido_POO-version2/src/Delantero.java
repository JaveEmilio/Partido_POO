public class Delantero extends Jugador{
    public Delantero(int dorsalJugador, EstadoDelJugador estadoDelJugador, boolean estadoDePoseciónDelBalón) {
        super(dorsalJugador,estadoDelJugador,estadoDePoseciónDelBalón);
    }

    @Override
    public boolean tuvoAccionesRelevantes() {
        //delantero tiene puede tener muchas acciones relevantes
        int accionesRelevantes = (int) (Math.random() * 10);
        if(accionesRelevantes>5){
            return true;
        }
            return false;
    }
}
