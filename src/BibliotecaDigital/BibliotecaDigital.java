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

    public Libro obtenerCopiaPersonalizada(String titulo, String anotacion, String marcador, String resumen) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                CopiaPersonalizada gestorCopia = new CopiaPersonalizada(libro);
                return (Libro) gestorCopia.personalizarCopia(anotacion, marcador, resumen);
            }
        }
        return null;
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