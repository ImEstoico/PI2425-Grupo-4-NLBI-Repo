package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Catalogo.Material;

public class Ropa extends Articulo {
    protected int talla;
    protected String tipoCierre;
    protected enum TipoRopa{};

    @JsonCreator
    public Ropa(@JsonProperty("codigoArticulo") String codigoArticulo,
                @JsonProperty("nombre") String nombre,
                @JsonProperty("precio") float precio,
                @JsonProperty("marca") String marca,
                @JsonProperty("descripcion") String descripcion,
                @JsonProperty("imagen") String imagen,
                @JsonProperty("activo") boolean activo,
                @JsonProperty("color") String color, Material material,
                @JsonProperty("talla") int talla,
                @JsonProperty("tipoCierre") String tipoCierre) {
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
