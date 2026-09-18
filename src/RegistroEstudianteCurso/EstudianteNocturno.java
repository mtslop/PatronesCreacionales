package RegistroEstudianteCurso;

public class EstudianteNocturno extends Estudiante {
    private String horario;

    public EstudianteNocturno(String nombre, String id, Perfil perfil, String horario) {
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