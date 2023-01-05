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
        String alineación = "******Alineación**********:" + nombreEquipo + "\n";
        for (Jugador jugador: jugadores) {
            if(!jugador.estaEnCancha()){
                alineación += jugador+"\n";
                return alineación;
            }
            alineación += jugador + "\n";
        }
        return alineación;
    }

    public String primerTiempo() {
        String reporte = "*****Acciones De los Equipos*******\n";
        Jugador[] jugadoresTitulares = new Jugador[11];
        jugadoresTitulares = obtenerEquipoTitular(jugadores);
        for(Jugador jugador: jugadoresTitulares){

            if(!jugador.tuvoAccionesRelevantes()){
                reporte += jugador + "no tuvo acciones\n";
            }
            reporte += jugador + "Buenas acciones relevantes\n";
            //jugador.goles();
        }
        return reporte;
    }

    private Jugador[] obtenerEquipoTitular(Jugador[] jugadores) {
        Jugador[] jugadoresTitulares = new Jugador[11];
        int i=0;
        for (Jugador jugadorTitular: jugadores ) {
            if(jugadorTitular.estaEnCancha()==true){
                return new Jugador[]{jugadoresTitulares[i] = jugadorTitular};
            }
            i++;
        }
        return  jugadoresTitulares;
    }


}
