public class Equipo {
    private String nombreEquipo;
    private String codigoDelEquipo;
    private Jugador[] jugadores;

    public Equipo(String nombreEquipo, String codigoDelEquipo, Jugador... jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.codigoDelEquipo = codigoDelEquipo;
        this.jugadores = jugadores;
    }

    public String alineación() {
        String alineación = "******Alineación**********";
        for (Jugador jugador: jugadores) {
            if(!jugador.estaEnCancha()){
                alineación += jugador.getEstadoDelJugador();
                return;
            }
            alineación += jugador.getEstadoDelJugador();
        }
        return alineación;
    }
}
