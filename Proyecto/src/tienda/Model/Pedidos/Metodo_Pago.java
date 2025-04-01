package tienda.Model.Pedidos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Metodo_Pago {

    private int codigo;
    private String descripcion ;
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    @JsonCreator
    public Metodo_Pago(
            @JsonProperty("codigo") int codigo,
            @JsonProperty("descripcion")String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    @JsonCreator
    public Metodo_Pago(
            @JsonProperty("codigo")int codigo,
            @JsonProperty("descripcion")String descripcion,
            ArrayList<Pedido> pedidos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pedidos = pedidos;
    }

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
