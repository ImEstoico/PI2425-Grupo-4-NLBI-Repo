class Empleado extends Usuario {

    private boolean tienePrivilegios;
    private Departamento departamento;

    public Empleado(String dni, String nombre, String apellidos, int telefono, String direccion, String email,
                    boolean activo, String pass, boolean tienePrivilegios, Departamento departamento) {
        super(dni, nombre, apellidos, telefono, direccion, email, activo, pass);
        this.tienePrivilegios = tienePrivilegios;
        this.departamento = departamento;
    }

    public boolean tienePrivilegios() {
        return tienePrivilegios;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setTienePrivilegios(boolean tienePrivilegios) {
        this.tienePrivilegios = tienePrivilegios;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void altaUsuario() {
        System.out.println("Alta de usuario");
    }

    public void bajaUsuario() {
        System.out.println("Baja de usuario");
    }

    public void modificarUsuario() {
        System.out.println("Modificación de usuario");
    }

    public void consultarUsuario() {
        System.out.println("Consulta de usuario");
    }

    public void gestionarProducto() {
        if (tienePrivilegios || departamento.equals("Almacén")) {
            System.out.println("Gestión de producto");
        } else {
            System.out.println("No tiene privilegios para gestionar productos");
        }
    }
}
