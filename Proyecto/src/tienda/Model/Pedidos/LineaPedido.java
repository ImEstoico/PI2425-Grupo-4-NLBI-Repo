package tienda.Model.Pedidos;

public class LineaPedido{

    private int cod_art; //Articulo
    private int num_pedido; //Pedido

    //Contructor


    public LineaPedido(int cod_art, int num_pedido) {
        this.cod_art = cod_art;
        this.num_pedido = num_pedido;
    }

    //Getter


    public int getNum_pedido() {
        return num_pedido;
    }

    public int getCod_art() {
        return cod_art;
    }

    //setter
    public void setCod_art(int cod_art) {
        this.cod_art = cod_art;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    //toString
    @Override
    public String toString() {
        return "LineaPedido{" +
                "cod_art=" + cod_art +
                ", num_pedido=" + num_pedido +
                '}';
    }
}
