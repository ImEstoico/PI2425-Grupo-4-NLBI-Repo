package tienda.Model;

public class Chaqueta extends Ropa {
    private boolean impermeable;

    public Chaqueta(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo,
                    int talla, String color, String tipoCierre, boolean impermeable) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, talla, color, tipoCierre);
        this.impermeable = impermeable;
    }

    public void mostrarDetalles() {
        System.out.println("Chaqueta: " + nombre + ", Impermeable: " + impermeable);
    }

    public boolean isImpermeable() {
        return impermeable;
    }

    public void setImpermeable(boolean impermeable) {
        this.impermeable = impermeable;
    }
}
