package RegistroEstudianteCurso;

public class Estudiante {
    private String nombre;
    private String id;
    private Perfil perfil;

    public Estudiante(String nombre, String id, Perfil perfil) {
        this.nombre = nombre;
        this.id = id;
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}