package tienda.Model.Articulos;

import tienda.Model.Articulos.*;
import tienda.Model.Catalogo.Material;

abstract class Accesorio extends Articulo {
    private String estilo;
    private boolean esPersonalizado;
    private enum TipoAccesorio{};

    public Accesorio(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen,
                     boolean activo, String color, Material material, String estilo, boolean esPersonalizado) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material);
        this.estilo = estilo;
        this.esPersonalizado = esPersonalizado;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean isEsPersonalizado() {
        return esPersonalizado;
    }

    public void setEsPersonalizado(boolean esPersonalizado) {
        this.esPersonalizado = esPersonalizado;
    }

}