public class Main {
    public static void main(String[] args) {
        Partido partido = new Partido(new Marcador(0,0));

        partido.entrarEquipo(new Equipo("Osasuna", "AFD12",
                new Portero(1,EstadoDelJugador.TITULAR,false),
                new Defensa(3,EstadoDelJugador.TITULAR,false),
                new Defensa(2,EstadoDelJugador.TITULAR,false),
                new Defensa(4,EstadoDelJugador.TITULAR,false),
                new Defensa(5,EstadoDelJugador.TITULAR,false),
                new Volante(1,EstadoDelJugador.TITULAR,false),
                new Volante(1,EstadoDelJugador.TITULAR,false),
                new Volante(1,EstadoDelJugador.TITULAR,false),
                new Delantero(1,EstadoDelJugador.TITULAR,false),
                new Delantero(1,EstadoDelJugador.TITULAR,false),
                new Delantero(1,EstadoDelJugador.TITULAR,false),
                new Portero(1,EstadoDelJugador.SUPLENTE,false),
                new Portero(1,EstadoDelJugador.SUPLENTE,false),
                new Portero(1,EstadoDelJugador.SUPLENTE,false),
                new Defensa(1,EstadoDelJugador.SUPLENTE,false),
                new Defensa(1,EstadoDelJugador.SUPLENTE,false),
                new Defensa(1,EstadoDelJugador.SUPLENTE,false),
                new Volante(1,EstadoDelJugador.SUPLENTE,false),
                new Volante(1,EstadoDelJugador.SUPLENTE,false),
                new Volante(1,EstadoDelJugador.SUPLENTE,false),
                new Delantero(1,EstadoDelJugador.SUPLENTE,false),
                new Delantero(1,EstadoDelJugador.SUPLENTE,false),
                new Delantero(1,EstadoDelJugador.SUPLENTE,false)
                ),
                new Equipo("Getafe", "DFE12",
                new Portero(1,EstadoDelJugador.TITULAR,false),
                new Defensa(3,EstadoDelJugador.TITULAR,false),
                new Defensa(2,EstadoDelJugador.TITULAR,false),
                new Defensa(4,EstadoDelJugador.TITULAR,false),
                new Defensa(5,EstadoDelJugador.TITULAR,false),
                new Volante(1,EstadoDelJugador.TITULAR,false),
                new Volante(1,EstadoDelJugador.TITULAR,false),
                new Volante(1,EstadoDelJugador.TITULAR,false),
                new Delantero(1,EstadoDelJugador.TITULAR,false),
                new Delantero(1,EstadoDelJugador.TITULAR,false),
                new Delantero(1,EstadoDelJugador.TITULAR,false),
                new Portero(1,EstadoDelJugador.SUPLENTE,false),
                new Portero(1,EstadoDelJugador.SUPLENTE,false),
                new Portero(1,EstadoDelJugador.SUPLENTE,false),
                new Defensa(1,EstadoDelJugador.SUPLENTE,false),
                new Defensa(1,EstadoDelJugador.SUPLENTE,false),
                new Defensa(1,EstadoDelJugador.SUPLENTE,false),
                new Volante(1,EstadoDelJugador.SUPLENTE,false),
                new Volante(1,EstadoDelJugador.SUPLENTE,false),
                new Volante(1,EstadoDelJugador.suplente,false),
                new Delantero(1,EstadoDelJugador.suplente,false),
                new Delantero(1,EstadoDelJugador.suplente,false),
                new Delantero(1,EstadoDelJugador.suplente,false)
        ));
        System.out.println(partido.reporteDelPartido());
        //partido.sorteroInicial.iniciarJuego();
        //partido.finalizarJuego();
        //partido.inicialJuego();
        //partido.finalizarJuego();

    }
}