package tienda.Model;

import tienda.Util.TipoRopa;

public class Chaqueta extends Ropa {
    private boolean impermeable;


    public Chaqueta(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen,
                    boolean activo, String color, Material material, int talla, String tipoCierre, boolean impermeable) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, talla, tipoCierre);
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