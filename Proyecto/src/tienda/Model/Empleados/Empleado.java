package tienda.Model.Empleados;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Usuarios.Usuario;

import java.io.Serializable;
import java.time.LocalDate;

public class Empleado extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean tienePrivilegios;
    private Departamento departamento;

    @JsonCreator
    public Empleado(@JsonProperty("dni") String dni,
                    @JsonProperty("apellidos") String apellidos,
                    @JsonProperty("nombre") String nombre,
                    @JsonProperty("telefono") int telefono,
                    @JsonProperty("direccion") String direccion,
                    @JsonProperty("email") String email,
                    @JsonProperty("activo") boolean activo,
                    @JsonProperty("pass") String pass,
                    @JsonProperty("f_nacimiento") LocalDate f_nacimiento,
                    @JsonProperty("tienePrivilegios") boolean tienePrivilegios, Departamento departamento) {
        super(dni, apellidos, nombre, telefono, direccion, email, activo, pass, f_nacimiento);
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
