package ConfiguracionJuegoEnLinea;

public abstract class ConfiguracionGlobal {
    private String nombre;

    public ConfiguracionGlobal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}