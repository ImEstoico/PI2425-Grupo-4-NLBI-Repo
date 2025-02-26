package articulo.model;

public class zapatos extends accesorio{
    int tallaZapato;
    String tipoSuela;

    public zapatos(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo, String estilo, boolean esPersonalizado, int tallaZapato, String tipoSuela) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, estilo, esPersonalizado);
        this.tallaZapato = tallaZapato;
        this.tipoSuela = tipoSuela;
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

    public void mostrarDetalles(){
        System.out.println("Zapatos: " + nombre + ", Talla : " + tallaZapato + " Tipo de suela : " + tipoSuela);
    }


}
