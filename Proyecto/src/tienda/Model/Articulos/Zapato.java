package tienda.Model.Articulos;

import tienda.Model.Catalogo.Material;
import tienda.Util.Enums.TipoAccesorio;

public class Zapato extends Accesorio {
    private int tallaZapato;
    private String tipoSuela;
    private TipoAccesorio tipo;

    public Zapato(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen,
                  boolean activo, String color, Material material, String estilo, boolean esPersonalizado,
                  int tallaZapato, String tipoSuela, TipoAccesorio tipo) {
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
