package ConfiguracionJuegoEnLinea;

import java.util.ArrayList;
import java.util.List;

public class GestorConfiguracion {
    private static GestorConfiguracion instancia;
    private List<ConfiguracionGlobal> listaConfiguraciones;

    private GestorConfiguracion() {
        this.listaConfiguraciones = new ArrayList<>();
    }

    public static  GestorConfiguracion obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    public void agregarConfiguracion(ConfiguracionGlobal configuracion) {
        this.listaConfiguraciones.add(configuracion);
    }

    public List<ConfiguracionGlobal> getListaConfiguraciones() {
        return listaConfiguraciones;
    }

    public void setListaConfiguraciones(List<ConfiguracionGlobal> listaConfiguraciones) {
        this.listaConfiguraciones = listaConfiguraciones;
    }
}