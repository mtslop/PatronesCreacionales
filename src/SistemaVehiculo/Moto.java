package SistemaVehiculo;

public class Moto extends Vehiculo {

    public Moto(MotoBuilder builder) {
        super(builder);
    }

    public Moto(Moto target) {
        super(target);
    }

    @Override
    public Moto clone() {
        return new Moto(this);
    }

    public static class MotoBuilder extends Builder {
        public MotoBuilder(String placa) {
            super("Moto", placa);
        }

        @Override
        public Moto build() {
            return new Moto(this);
        }
    }
}