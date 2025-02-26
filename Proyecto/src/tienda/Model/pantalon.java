package tienda.Model;

public class pantalon extends ropa {
    private boolean tieneBolsillo;
    private String tipoPantalon;

    public pantalon(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo,
                    int talla, String color, String tipoCierre, boolean tieneBolsillo, String tipoPantalon) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, talla, color, tipoCierre);
        this.tieneBolsillo = tieneBolsillo;
        this.tipoPantalon = tipoPantalon;
    }

    public boolean isTieneBolsillo() {
        return tieneBolsillo;
    }

    public void setTieneBolsillo(boolean tieneBolsillo) {
        this.tieneBolsillo = tieneBolsillo;
    }

    public String getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }

    public void mostrarDetalles() {
        System.out.println("Pantalón: " + nombre + ", Tipo: " + tipoPantalon);
    }
}
