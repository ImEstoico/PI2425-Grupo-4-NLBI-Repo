abstract class Usuario {

    private String dni;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String direccion;
    private String email;
    private boolean activo;
    private String pass;

    public Usuario(String dni, String nombre, String apellidos, int telefono,
                   String direccion, String email, boolean activo, String pass) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.activo = activo;
        this.pass = pass;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getPass() {
        return pass;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", activo=" + activo +
                ", pass='" + pass + '\'' +
                '}';
    }
}
