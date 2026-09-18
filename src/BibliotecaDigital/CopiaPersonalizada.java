package BibliotecaDigital;

public class CopiaPersonalizada {
    private Clonable copiable;

    public CopiaPersonalizada(Clonable copiable) {
        this.copiable = copiable;
    }

    public Libro personalizarCopia(String anotacion, String marcador, String resumen) throws CloneNotSupportedException {
        Libro copia = copiable.clonar();
        if (anotacion != null) copia.agregarAnotacion(anotacion);
        if (marcador != null) copia.agregarMarcador(marcador);
        if (resumen != null) copia.agregarResumen(resumen);
        return copia;
    }

    public Clonable getCopiable() {
        return copiable;
    }

    public void setCopiable(Clonable copiable) {
        this.copiable = copiable;
    }
}
