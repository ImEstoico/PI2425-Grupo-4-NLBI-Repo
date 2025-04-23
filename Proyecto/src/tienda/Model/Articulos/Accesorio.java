package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Articulos.*;
import tienda.Model.Catalogo.Material;

public class Accesorio extends Articulo {
    private String estilo;
    private boolean esPersonalizado;
    private enum TipoAccesorio{};

    @JsonCreator
    public Accesorio(@JsonProperty("codigoArticulo") String codigoArticulo,
                     @JsonProperty("nombre") String nombre,
                     @JsonProperty("precio") float precio,
                     @JsonProperty("marca") String marca,
                     @JsonProperty("descripcion") String descripcion,
                     @JsonProperty("imagen") String imagen,
                     @JsonProperty("activo") boolean activo,
                     @JsonProperty("color") String color, Material material,
                     @JsonProperty("estilo") String estilo,
                     @JsonProperty("esPersonalizado") boolean esPersonalizado) {
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