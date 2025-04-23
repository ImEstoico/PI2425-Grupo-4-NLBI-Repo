package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Catalogo.Material;
import tienda.Util.Enums.TipoAccesorio;

public class Zapato extends Accesorio {
    private int tallaZapato;
    private String tipoSuela;
    private TipoAccesorio tipo;

    @JsonCreator
    public Zapato(@JsonProperty("codigoArticulo") String codigoArticulo,
                  @JsonProperty("nombre") String nombre,
                  @JsonProperty("precio") float precio,
                  @JsonProperty("marca") String marca,
                  @JsonProperty("descripcion") String descripcion,
                  @JsonProperty("imagen") String imagen,
                  @JsonProperty("activo") boolean activo,
                  @JsonProperty("color") String color, Material material,
                  @JsonProperty("estilo") String estilo,
                  @JsonProperty("esPersonalizado") boolean esPersonalizado,
                  @JsonProperty("tallaZapato") int tallaZapato,
                  @JsonProperty("tipoSuela") String tipoSuela,
                  @JsonProperty("tipo") TipoAccesorio tipo) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, estilo, esPersonalizado);
        this.tallaZapato = tallaZapato;
        this.tipoSuela = tipoSuela;
        this.tipo = tipo;
    }


    public int getTallaZapato() {
        return tallaZapato;
    }

    public void setTallaZapato(int tallaZapato) {
        this.tallaZapato = tallaZapato;
    }

    public String getTipoSuela() {
        return tipoSuela;
    }

    public void setTipoSuela(String tipoSuela) {
        this.tipoSuela = tipoSuela;
    }

    public TipoAccesorio getZapatoTipo() {
        return tipo;
    }

    public void setZapatoTipo(TipoAccesorio zapatoTipo) {
        this.tipo = zapatoTipo;
    }

    public void mostrarDetalles(){
        System.out.println("Zapatos: " + nombre + ", Talla : " + tallaZapato + " Tipo de suela : " + tipoSuela);
    }
}
