package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Catalogo.Material;
import tienda.Model.Articulos.Ropa;

public class Camisa extends Ropa {
    private String tipoManga;
    private boolean esEstampada;

    @JsonCreator
    public Camisa(@JsonProperty("codigoArticulo") String codigoArticulo,
                  @JsonProperty("nombre") String nombre,
                  @JsonProperty("precio") float precio,
                  @JsonProperty("marca") String marca,
                  @JsonProperty("descripcion") String descripcion,
                  @JsonProperty("imagen") String imagen,
                  @JsonProperty("activo") boolean activo,
                  @JsonProperty("color") String color, Material material,
                  @JsonProperty("talla") int talla,
                  @JsonProperty("tipoCierre") String tipoCierre,
                  @JsonProperty("tipoManga") String tipoManga,
                  @JsonProperty("esEstampada") boolean esEstampada ) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, talla, tipoCierre);
        this.tipoManga = tipoManga;
        this.esEstampada = esEstampada;

    }

    public void mostrarDetalles() {
        System.out.println("Camisa: " + nombre + ", Tipo de Manga: " + tipoManga);
    }

    public String getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }

    public boolean isEsEstampada() {
        return esEstampada;
    }

    public void setEsEstampada(boolean esEstampada) {
        this.esEstampada = esEstampada;
    }

}