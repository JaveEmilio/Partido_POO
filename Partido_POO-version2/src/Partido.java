public class Partido {
    private Equipo[] equipos;
    private Marcador marcador;

    public Partido(Marcador marcador) {

        this.marcador = marcador;
    }

    public void entrarEquipo(Equipo... equipos) {
        this.equipos = equipos;
    }

    public String reporteDelPartido() {
        String reporte = "***********REPORTE PARTIDO******************\n";
        for(Equipo equipo: equipos){
            reporte += equipo.alineación() + "\n";
        }
        for(Equipo equipo: equipos){
            reporte += equipo.primerTiempo();
        }
        return reporte;
    }
}
