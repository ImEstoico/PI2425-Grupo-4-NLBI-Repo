package tienda.Model;

class Cliente extends Usuario {
    private int numeroPedidos;
    private boolean tieneTarjetaFidelizacion;
    private String direccionEnvio;
    private String metodoPago;

    public Cliente(String dni, String nombre, String apellidos, int telefono,
                   String direccion, String email, int numeroPedidos, boolean tieneTarjetaFidelizacion, String direccionEnvio, String metodoPago) {
        super(dni, nombre, apellidos, telefono, direccion, email);
        this.numeroPedidos = numeroPedidos;
        this.tieneTarjetaFidelizacion = tieneTarjetaFidelizacion;
        this.direccionEnvio = direccionEnvio;
        this.metodoPago = metodoPago;
    }

    public int getNumeroPedidos() {
        return numeroPedidos;
    }

    public boolean tieneTarjetaFidelizacion() {
        return tieneTarjetaFidelizacion;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public String getMetodoPago() {
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

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
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

