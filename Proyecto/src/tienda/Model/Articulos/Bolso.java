package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Catalogo.Material;
import tienda.Util.Enums.TipoAccesorio;

public class Bolso extends Accesorio {

    private String tipoCerre;
    private int capacidad;
    private TipoAccesorio tipo;


    @JsonCreator
    public Bolso(@JsonProperty("codigoArticulo") String codigoArticulo,
                 @JsonProperty("nombre") String nombre,
                 @JsonProperty("precio") float precio,
                 @JsonProperty("marca") String marca,
                 @JsonProperty("descripcion") String descripcion,
                 @JsonProperty("imagen") String imagen,
                 @JsonProperty("activo") boolean activo,
                 @JsonProperty("color") String color, Material material,
                 @JsonProperty("estilo") String estilo,
                 @JsonProperty("esPersonalizado") boolean esPersonalizado,
                 @JsonProperty("tipoCierre") String tipoCerre,
                 @JsonProperty("capacidad") int capacidad,
                 @JsonProperty("tipo") TipoAccesorio tipo) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, color, material, estilo, esPersonalizado);
        this.tipoCerre = tipoCerre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getTipoCerre() {
        return tipoCerre;
    }

    public void setTipoCerre(String tipoCerre) {
        this.tipoCerre = tipoCerre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoAccesorio getTipo() {
        return tipo;
    }

    public void setTipo(TipoAccesorio tipo) {
        this.tipo = tipo;
    }

    public void mostrarDetalles() {
        System.out.println("Bolso: " + nombre + ", Capacidad: " + capacidad + " litros");
    }
}
