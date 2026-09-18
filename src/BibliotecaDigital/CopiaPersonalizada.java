package BibliotecaDigital;

public class CopiaPersonalizada {
    private Clonable copiable;

    public CopiaPersonalizada(Clonable copiable) {
        this.copiable = copiable;
    }

    public Clonable personalizarCopia(String anotacion, String marcador, String resumen) {
        Clonable copia = this.copiable.clone();
        if (copia instanceof Libro) {
            Libro libroCopia = (Libro) copia;
            if (anotacion != null) libroCopia.agregarAnotacion(anotacion);
            if (marcador != null) libroCopia.agregarMarcador(marcador);
            if (resumen != null) libroCopia.agregarResumen(resumen);
        }
        return copia;
    }

    public Clonable getCopiable() {
        return copiable;
    }

    public void setCopiable(Clonable copiable) {
        this.copiable = copiable;
    }
}