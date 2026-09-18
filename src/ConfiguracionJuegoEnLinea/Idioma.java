package ConfiguracionJuegoEnLinea;

public class Idioma extends ConfiguracionGlobal {
    private String idioma;

    public Idioma(String nombre, String idioma) {
        super(nombre);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}