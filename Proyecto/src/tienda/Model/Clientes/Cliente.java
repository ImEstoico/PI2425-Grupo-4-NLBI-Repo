package tienda.Model.Clientes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Pedidos.Metodo_Pago;
import tienda.Model.Pedidos.Pedido;
import tienda.Model.Usuarios.Usuario;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private int numeroPedidos;
    private boolean tieneTarjetaFidelizacion;
    private String direccionEnvio;
    private Metodo_Pago metodoPago;
    ArrayList<Pedido> pedidos = new ArrayList<>();

    @JsonCreator
    public Cliente(
            @JsonProperty("dni") String dni,
            @JsonProperty("apellidos") String apellidos,
            @JsonProperty("nombre") String nombre,
            @JsonProperty("telefono")int telefono,
            @JsonProperty("direccion")String direccion,
            @JsonProperty("email")String email,
            @JsonProperty("activo")boolean activo,
            @JsonProperty("pass")String pass,
            @JsonProperty("f_nacimiento")LocalDate f_nacimiento,
            @JsonProperty("numeroPedidos")int numeroPedidos,
            @JsonProperty("tieneTarjetaFidelizacion")boolean tieneTarjetaFidelizacion,
            @JsonProperty("direccionEnvio")String direccionEnvio,
            Metodo_Pago metodoPago,
            ArrayList<Pedido> pedidos) {
        super(dni, apellidos, nombre, telefono, direccion, email, activo, pass, f_nacimiento);
        this.numeroPedidos = numeroPedidos;
        this.tieneTarjetaFidelizacion = tieneTarjetaFidelizacion;
        this.direccionEnvio = direccionEnvio;
        this.metodoPago = metodoPago;
        this.pedidos = pedidos;
    }

    public int getNumeroPedidos() {
        return numeroPedidos;
    }

    public boolean isTieneTarjetaFidelizacion() {
        return tieneTarjetaFidelizacion;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public Metodo_Pago getMetodoPago() {
        return metodoPago;
    }

    public void setNumeroPedidos(int numeroPedidos) {
        this.numeroPedidos = numeroPedidos;
    }

    public void setTieneTarjetaFidelizacion(boolean tieneTarjetaFidelizacion) {
        this.tieneTarjetaFidelizacion = tieneTarjetaFidelizacion;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public void setMetodoPago(Metodo_Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void realizarPedido() {
        if (numeroPedidos > 0) {
            System.out.println("Realizando pedido...");
        } else {
            System.out.println("Debe registrarse como cliente primero.");
        }
    }

    public void verArticulos() {
        System.out.println("Visualizando artículos de la tienda...");
    }
}