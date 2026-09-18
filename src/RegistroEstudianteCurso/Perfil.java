package RegistroEstudianteCurso;

public class Perfil {
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String intereses;


    private Perfil(Builder builder) {
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.intereses = builder.intereses;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }


    public static class Builder {
        private String nombre;
        private String correo;
        private String telefono;
        private String direccion;
        private String intereses;

        public Builder(String nombre, String correo) {
            this.nombre = nombre;
            this.correo = correo;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder setIntereses(String intereses) {
            this.intereses = intereses;
            return this;
        }

        public Perfil build() {
            return new Perfil(this);
        }
    }
}