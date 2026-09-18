package RegistroEstudianteCurso;

public class EstudianteDiurno extends Estudiante {
    private String horario;

    public EstudianteDiurno(String nombre, String id, Perfil perfil, String horario) {
        super(nombre, id, perfil);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}