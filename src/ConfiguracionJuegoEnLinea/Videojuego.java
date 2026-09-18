package ConfiguracionJuegoEnLinea;

import java.util.ArrayList;
import java.util.List;

public class Videojuego {
    private String nombre;
    private List<Jugador> listaJugadores;
    private GestorConfiguracion gestor;

    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
        this.gestor = GestorConfiguracion.obtenerInstancia();
    }

    public void registrarJugador(Jugador jugador) {
        this.listaJugadores.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public GestorConfiguracion getGestor() {
        return gestor;
    }

    public void setGestor(GestorConfiguracion gestor) {
        this.gestor = gestor;
    }
}