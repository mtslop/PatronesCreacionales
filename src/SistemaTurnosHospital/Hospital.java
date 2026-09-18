package SistemaTurnosHospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String denominacion;
    private List<Paciente> pacientesRegistrados;
    private GestorTurno gestorPrincipal;

    public Hospital(String denominacion) {
        this.denominacion = denominacion;
        this.pacientesRegistrados = new ArrayList<>();
        this.gestorPrincipal = GestorTurno.getInstancia();
    }

    public void registrarPaciente(Paciente paciente) {
        this.pacientesRegistrados.add(paciente);
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Paciente> getPacientesRegistrados() {
        return pacientesRegistrados;
    }

    public GestorTurno getGestorPrincipal() {
        return gestorPrincipal;
    }
}
