package SistemaTurnosHospital;

public class Paciente {

    private String nombreCompleto;
    private int identificacion;
    private Turno turnoAsignado;

    public Paciente(String nombreCompleto, int identificacion, Turno turnoAsignado) {
        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.turnoAsignado = turnoAsignado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Turno getTurnoAsignado() {
        return turnoAsignado;
    }

    public void setTurnoAsignado(Turno turnoAsignado) {
        this.turnoAsignado = turnoAsignado;
    }
}