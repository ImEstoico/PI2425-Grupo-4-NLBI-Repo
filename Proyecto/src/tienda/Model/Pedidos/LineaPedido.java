package tienda.Model.Pedidos;

import tienda.Model.Articulos.Articulo;

public class LineaPedido{

    private int num_pedido; //Pedido
    private Articulo articulo;

    //Contructor

    public LineaPedido(int num_pedido, Articulo articulo) {
        this.num_pedido = num_pedido;
        this.articulo = articulo;
    }


    //Getter


    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getNum_pedido() {
        return num_pedido;
    }



    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    @Override
    public String toString() {
        return "LineaPedido{" +
                "num_pedido=" + num_pedido +
                ", articulo=" + articulo +
                '}';
    }
}
