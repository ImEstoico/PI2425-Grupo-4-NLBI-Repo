package tienda.Model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int numeroPedido ;
    private Date fecha ;
    private String dir_envio;
    private enum estado{}
    ArrayList<LineaPedido> lineaPedidos = new ArrayList<LineaPedido>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    //Contructor
    public Pedido(int numeroPedido, Date fecha, String dir_envio, ArrayList<LineaPedido> lineaPedidos, ArrayList<Cliente> clientes) {
        this.numeroPedido = numeroPedido;
        this.fecha = fecha;
        this.dir_envio = dir_envio;
        this.lineaPedidos = lineaPedidos;
        this.clientes = clientes;
    }

    //Getter
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDir_envio() {
        return dir_envio;
    }

    public ArrayList<LineaPedido> getLineaPedidos() {
        return lineaPedidos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


    //setter
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setLineaPedidos(ArrayList<LineaPedido> lineaPedidos) {
        this.lineaPedidos = lineaPedidos;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDir_envio(String dir_envio) {
        this.dir_envio = dir_envio;
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
                ", fechaPedido=" + fecha +
                ", direccEntrega='" + dir_envio + '\'' +
                '}';
    }
}
