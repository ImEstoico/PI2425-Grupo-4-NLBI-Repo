public class LineaPedido{

    private int cod_art;
    private int num_pedido;
    private Pedido pedido;

    //Contructor


    public LineaPedido(int cod_art, int num_pedido, Pedido pedido) {
        this.cod_art = cod_art;
        this.num_pedido = num_pedido;
        this.pedido = pedido;
    }

    //Getter


    public int getCod_art() {
        return cod_art;
    }

    public int getNum_pedido() {
        return num_pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    //setter
    public void setCod_art(int cod_art) {
        this.cod_art = cod_art;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    //toString
    @Override
    public String toString() {
        return "LineaPedido{" +
                "cod_art=" + cod_art +
                ", num_pedido=" + num_pedido +
                ", pedido=" + pedido +
                '}';
    }
}
