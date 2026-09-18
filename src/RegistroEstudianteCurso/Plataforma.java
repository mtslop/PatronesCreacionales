package RegistroEstudianteCurso;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Estudiante> listaEstudiantes;
    private List<Perfil> listaPerfiles;

    public Plataforma() {
        this.listaEstudiantes = new ArrayList<>();
        this.listaPerfiles = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }

    public void registrarPerfil(Perfil perfil) {
        this.listaPerfiles.add(perfil);
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Perfil> getListaPerfiles() {
        return listaPerfiles;
    }

    public void setListaPerfiles(List<Perfil> listaPerfiles) {
        this.listaPerfiles = listaPerfiles;
    }
}