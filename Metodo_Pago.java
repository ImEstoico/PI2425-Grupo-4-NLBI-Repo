package tienda.Model;

import java.util.ArrayList;

public class Metodo_Pago {

    private int codigo;
    private String descripcion ;
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    //Getter
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    //setter
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }




}
