package tienda.Util;

public enum EstadoPedido{
    EN_PROCESO("en proceso"),

    COMPLETADO("Completado"),

    CANCELADO("cancelado");

    private final String descripcion;

    EstadoPedido(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return getDescripcion();
    }

}
