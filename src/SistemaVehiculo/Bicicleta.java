package SistemaVehiculo;

public class Bicicleta extends Vehiculo {

    public Bicicleta(BicicletaBuilder builder) {
        super(builder);
    }

    public Bicicleta(Bicicleta target) {
        super(target);
    }

    @Override
    public Bicicleta clone() {
        return new Bicicleta(this);
    }

    public static class BicicletaBuilder extends Builder {
        public BicicletaBuilder(String placa) {
            super("Bicicleta", placa);
        }

        @Override
        public Bicicleta build() {
            return new Bicicleta(this);
        }
    }
}