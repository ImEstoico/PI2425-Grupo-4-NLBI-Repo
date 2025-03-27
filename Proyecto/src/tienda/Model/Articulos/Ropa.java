package tienda.Model.Articulos;

import tienda.Model.Catalogo.Material;

abstract class Ropa extends Articulo {
    protected int talla;
    protected String tipoCierre;
    protected enum TipoRopa{};

    public Ropa(String codigoArticulo, String nombre, float precio, String marca, String descripcion,
                String imagen, boolean activo, String color, Material material, int talla, String tipoCierre) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material);
        this.talla = talla;
        this.tipoCierre = tipoCierre;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

}
