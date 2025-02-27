package tienda.Model;

import java.util.ArrayList;

public class Venta {

    ArrayList<Articulo> ventas = new ArrayList();

    // Constructor con parámetros

    public Venta(ArrayList<Articulo> ventas) {
        this.ventas = ventas;
    }

    // Método para buscar un pedido por código. Si no lo encuentra, muestra un mensaje.
    // CAMBIOS NECESARIOS DE A FUTURO
    public void buscarCodigoPedido(int codigo) {
        for (Articulo v : ventas) {
            if (v.getnumeroPedido() == codigo) {
                return v;
            }
            System.out.println("No se encontro el pedido");
            return;
        }
    }

    // Método para buscar un cliente por nombre. Si no lo encuentra, muestra un mensaje.
    // CAMBIOS NECESARIOS DE A FUTURO
    public void buscarCliente(String nombre) {
        for (Articulo v : ventas) {
            if (v.getnombre() == nombre) {
                return v;
            }
            System.out.println("No se encontro el cliente");
            return;
        }
    }

    // Método para calcular el precio de venta.

    public int calcularPrecioVenta(){
        int precioVenta = 0;
        for (Articulo v : ventas) {
            precioVenta += v.getprecio();
        }
        return precioVenta;
    }
}
