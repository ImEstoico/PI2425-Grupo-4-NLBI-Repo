package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Catalogo.Material;
import tienda.Model.Articulos.Ropa;

public class Pantalon extends Ropa {
    private boolean tieneBolsillo;
    private String tipoPantalon;

    @JsonCreator
    public Pantalon(@JsonProperty("codigoArticulo") String codigoArticulo,
                    @JsonProperty("nombre") String nombre,
                    @JsonProperty("precio") float precio,
                    @JsonProperty("marca") String marca,
                    @JsonProperty("descripcion") String descripcion,
                    @JsonProperty("imagen") String imagen,
                    @JsonProperty("activo") boolean activo,
                    @JsonProperty("color") String color, Material material,
                    @JsonProperty("talla") int talla,
                    @JsonProperty("tipoCierre") String tipoCierre,
                    @JsonProperty("tieneBolsillo") boolean tieneBolsillo,
                    @JsonProperty("tipoPantalon") String tipoPantalon) {
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
