package tienda.Model;

public class Bolso extends Accesorio{

    String tipoCerre;
    int capacidad;

    public Bolso(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, boolean activo, String estilo, boolean esPersonalizado, String tipoCerre, int capacidad) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo, estilo, esPersonalizado);
        this.tipoCerre = tipoCerre;
        this.capacidad = capacidad;
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

    public void mostrarDetalles() {
        System.out.println("Bolso: " + nombre + ", Capacidad: " + capacidad + " litros");
    }
}
