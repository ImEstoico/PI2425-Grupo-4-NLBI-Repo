package Util;

public class LineaPedido extends Pedido{

    private int idLinea;
    private int cantidad;

    //Contructor
    public LineaPedido(int numeroPedido, int fechaPedido, String direccEntrega, int idLinea, int cantidad) {
        super(numeroPedido, fechaPedido, direccEntrega);
        this.idLinea = idLinea;
        this.cantidad = cantidad;
    }

    //Getter
    public int getIdLinea() {
        return idLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    //setter
    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LineaPedido{" +
                "idLinea=" + idLinea +
                ", cantidad=" + cantidad +
                '}';
    }
}
