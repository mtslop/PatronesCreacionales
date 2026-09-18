package ConfiguracionJuegoEnLinea;

public class Sonido extends ConfiguracionGlobal {
    private int nivel;

    public Sonido(String nombre, int nivel) {
        super(nombre);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}