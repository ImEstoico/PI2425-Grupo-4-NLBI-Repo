public class Camisa extends Ropa {
    private String tipoManga;
    private boolean esEstampada;

    public Camisa(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo,
                  String color, Material material, int talla, String tipoCierre, String tipoManga, boolean esEstampada) {
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