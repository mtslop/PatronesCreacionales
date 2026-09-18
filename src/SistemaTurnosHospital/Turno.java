package SistemaTurnosHospital;

public class Turno {

    private EstadoTurno estadoActual;
    private String etiqueta;
    private String fechaCreacion;
    private String codigoSerial;
    private GestorTurno gestorAsociado;

    public Turno(String etiqueta, String fechaCreacion, String codigoSerial) {
        this.etiqueta = etiqueta;
        this.fechaCreacion = fechaCreacion;
        this.codigoSerial = codigoSerial;
        this.estadoActual = EstadoTurno.EN_ESPERA;
        this.gestorAsociado = GestorTurno.getInstancia();
    }

    public EstadoTurno getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoTurno estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public void setCodigoSerial(String codigoSerial) {
        this.codigoSerial = codigoSerial;
    }

    public GestorTurno getGestorAsociado() {
        return gestorAsociado;
    }

    public void setGestorAsociado(GestorTurno gestorAsociado) {
        this.gestorAsociado = gestorAsociado;
    }
}