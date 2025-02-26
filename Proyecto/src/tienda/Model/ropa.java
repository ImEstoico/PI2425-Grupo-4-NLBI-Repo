package articulo.model;

abstract class ropa extends articulo {
    protected int talla;
    protected String color;
    protected String tipoCierre;

    public ropa(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo,
                int talla, String color, String tipoCierre) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo);
        this.talla = talla;
        this.color = color;
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