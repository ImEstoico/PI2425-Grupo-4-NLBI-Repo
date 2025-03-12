public class Pantalon extends Ropa {
    private boolean tieneBolsillo;
    private String tipoPantalon;

    public Pantalon(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo,
                    String color, Material material, int talla, String tipoCierre, boolean tieneBolsillo, String tipoPantalon) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, talla, tipoCierre);
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
