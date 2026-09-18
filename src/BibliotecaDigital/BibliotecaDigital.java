package BibliotecaDigital;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDigital {
    private String nombre;
    private String correo;
    private List<Libro> listaLibros;

    public BibliotecaDigital(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.listaLibros = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        this.listaLibros.add(libro);
    }

    public Libro obtenerCopiaPersonalizada(Libro libroOriginal) throws CloneNotSupportedException {
        Libro copia = libroOriginal.clonar();
        this.listaLibros.add(copia);
        return copia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
}
