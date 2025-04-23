package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Catalogo.Material;
import tienda.Model.Articulos.Ropa;

public class Chaqueta extends Ropa {
    private boolean impermeable;

    @JsonCreator
    public Chaqueta(@JsonProperty("codigoArticulo") String codigoArticulo,
                    @JsonProperty("nombre") String nombre,
                    @JsonProperty("precio") float precio,
                    @JsonProperty("marca") String marca,
                    @JsonProperty("descripcion") String descripcion,
                    @JsonProperty("imagen") String imagen,
                    @JsonProperty("activo") boolean activo,
                    @JsonProperty("color") String color, Material material,
                    @JsonProperty("talla") int talla,
                    @JsonProperty("tipoCierre") String tipoCierre,
                    @JsonProperty("impermeable") boolean impermeable) {
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