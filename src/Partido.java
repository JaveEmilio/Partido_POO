public class Partido {
    private Equipo[] equipos;

    public void entrarEquipo(Equipo... equipos) {
        this.equipos = equipos;
    }

    public String reporteDelPartido() {
        String reporte = "***********REPORTE PARTIDO******************";
        for(Equipo equipo: equipos){
            reporte += equipo.alineación();
        }
    }
}
