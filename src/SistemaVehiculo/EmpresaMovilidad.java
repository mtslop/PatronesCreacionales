package SistemaVehiculo;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMovilidad {
    private String nombre;
    private List<Vehiculo> listaVehiculos;

    public EmpresaMovilidad(String nombre) {
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        this.listaVehiculos.add(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}