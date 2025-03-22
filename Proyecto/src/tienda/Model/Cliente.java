package tienda.Model;

import java.time.LocalDate;
import java.util.ArrayList;

abstract class Cliente extends Usuario {

    private int numeroPedidos;
    private boolean tieneTarjetaFidelizacion;
    private String direccionEnvio;
    private Metodo_Pago metodoPago;
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String dni, String apellidos, String nombre, int telefono, String direccion, String email,
                   boolean activo, String pass, LocalDate f_nacimiento, int numeroPedidos,
                   boolean tieneTarjetaFidelizacion, String direccionEnvio, Metodo_Pago metodoPago,
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