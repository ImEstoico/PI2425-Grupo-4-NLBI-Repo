package tienda.Model;

abstract class Accesorio extends Articulo {
    protected String estilo;
    protected boolean esPersonalizado;

    public Accesorio(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo,
                     String estilo, boolean esPersonalizado) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo);
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

