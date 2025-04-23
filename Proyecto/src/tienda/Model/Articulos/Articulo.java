package tienda.Model.Articulos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import tienda.Model.Catalogo.Material;

  public abstract class Articulo {
    protected String codigoArticulo;
    protected String nombre;
    protected float precio;
    protected String marca;
    protected String descripcion;
    protected String imagen;
    protected boolean activo;
    protected String color;
    protected Material material;

    @JsonCreator
    public Articulo(@JsonProperty("codigoArticulo") String codigoArticulo,
                    @JsonProperty("nombre") String nombre,
                    @JsonProperty("precio") float precio,
                    @JsonProperty("marca") String marca,
                    @JsonProperty("descripcion") String descripcion,
                    @JsonProperty("imagen") String imagen,
                    @JsonProperty("activo") boolean activo,
                    @JsonProperty("color") String color, Material material) {
        this.codigoArticulo = codigoArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.activo = activo;
        this.color = color;
        this.material = material;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}