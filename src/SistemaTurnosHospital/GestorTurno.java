package SistemaTurnosHospital;

public class GestorTurno {

    private static GestorTurno instancia;
    private Turno turnoActual;
    private GestorTurno(Turno turno) {
        this.turnoActual = turno;
    }

    public static GestorTurno getInstancia() {
        if (instancia == null) {
            instancia = new GestorTurno(null);
        }
        return instancia;
    }

    public void asignarTurno() {
        if (this.turnoActual != null) {
            this.turnoActual.setEstadoActual(EstadoTurno.ASIGNADO);
        }
    }

    public void cambiarEstadoTurno(EstadoTurno nuevoEstado) {
        if (this.turnoActual != null) {
            this.turnoActual.setEstadoActual(nuevoEstado);
        }
    }

    public Turno getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(Turno turno) {
        this.turnoActual = turno;
    }
}