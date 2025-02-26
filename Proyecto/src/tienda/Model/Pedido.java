package tienda.Model;

public class Pedido {

    private int numeroPedido ;
    private int fechaPedido ;
    private String direccEntrega;
    private enum estado{}

    //Contructor
    public Pedido(int numeroPedido, int fechaPedido, String direccEntrega) {
        this.numeroPedido = numeroPedido;
        this.fechaPedido = fechaPedido;
        this.direccEntrega = direccEntrega;
        
    }

    //Getter
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public int getFechaPedido() {
        return fechaPedido;
    }

    public String getDireccEntrega() {
        return direccEntrega;
    }

    //setter
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setFechaPedido(int fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setDireccEntrega(String direccEntrega) {
        this.direccEntrega = direccEntrega;
    }


    public void mostrarPedido() {
        System.out.println("mostrar pedido");
    }

    public void calcularTotal() {
        System.out.println("calcular total de pedidos");
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", fechaPedido=" + fechaPedido +
                ", direccEntrega='" + direccEntrega + '\'' +
                '}';
    }
}
