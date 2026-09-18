package SistemaVehiculo;


import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo implements Clonable {
    protected String tipo;
    protected String placa;
    protected String color;
    protected int capacidad;
    protected List<String> accesorios;


    protected Vehiculo(Builder builder) {
        this.tipo = builder.tipo;
        this.placa = builder.placa;
        this.color = builder.color;
        this.capacidad = builder.capacidad;
        this.accesorios = new ArrayList<>(builder.accesorios);
    }


    protected Vehiculo(Vehiculo target) {
        if (target != null) {
            this.tipo = target.tipo;
            this.placa = target.placa;
            this.color = target.color;
            this.capacidad = target.capacidad;
            this.accesorios = new ArrayList<>(target.accesorios);
        }
    }


    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public List<String> getAccesorios() { return accesorios; }
    public void setAccesorios(List<String> accesorios) { this.accesorios = accesorios; }

    @Override
    public abstract Vehiculo clone();


    public static abstract class Builder implements Construible {
        protected String tipo;
        protected String placa;
        protected String color;
        protected int capacidad;
        protected List<String> accesorios = new ArrayList<>();

        public Builder(String tipo, String placa) {
            this.tipo = tipo;
            this.placa = placa;
        }

        @Override
        public Builder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        @Override
        public Builder setPlaca(String placa) {
            this.placa = placa;
            return this;
        }

        @Override
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public Builder setCapacidad(int capacidad) {
            this.capacidad = capacidad;
            return this;
        }

        @Override

        public Builder agregarAccesorio(String accesorio) {
            this.accesorios.add(accesorio);
            return this;
        }

        public abstract Vehiculo build();
    }
}