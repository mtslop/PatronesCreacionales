package BibliotecaDigital;

public class Libro implements Clonable {
    private String titulo;
    private String contenido;
    private String anotaciones;
    private String marcadores;
    private String resumen;


    public Libro(String titulo, String contenido, String anotaciones, String marcadores, String resumen) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.anotaciones = anotaciones;
        this.marcadores = marcadores;
        this.resumen = resumen;
    }


    public Libro(Libro libro) {
            this.titulo = libro.titulo;
            this.contenido = libro.contenido;
            this.anotaciones = libro.anotaciones;
            this.marcadores = libro.marcadores;
            this.resumen = libro.resumen;
    }

    @Override
    public Clonable clone() {
        return new Libro(this);
    }


    public void agregarAnotacion(String anotacion) {
        if (this.anotaciones == null || this.anotaciones.isEmpty()) {
            this.anotaciones = anotacion;
        } else {
            this.anotaciones += " | " + anotacion;
        }
    }

    public void agregarMarcador(String marcador) {
        if (this.marcadores == null || this.marcadores.isEmpty()) {
            this.marcadores = marcador;
        } else {
            this.marcadores += " | " + marcador;
        }
    }

    public void agregarResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getMarcadores() {
        return marcadores;
    }

    public void setMarcadores(String marcadores) {
        this.marcadores = marcadores;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", anotaciones='" + anotaciones + '\'' +
                ", marcadores='" + marcadores + '\'' +
                ", resumen='" + resumen + '\'' +
                '}';
    }
}