package tienda.Util;

public enum TipoRopa{
    chaqueta("chaqueta"), camisa("camisa"), pantalon("pantalón");

    private final String descripcion;

    TipoRopa(String descripcion){
        this.descripcion = descripcion;
    }
}
