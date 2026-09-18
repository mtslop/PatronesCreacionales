package ConfiguracionJuegoEnLinea;

public class Dificultad extends ConfiguracionGlobal {
    private int nivel;

    public Dificultad(String nombre, int nivel) {
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