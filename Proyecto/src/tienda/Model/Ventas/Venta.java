package tienda.Model.Ventas;

import tienda.Model.Clientes.Cliente;
import tienda.Model.Pedidos.LineaPedido;
import tienda.Model.Pedidos.Pedido;

import java.util.ArrayList;

public class Venta {

    ArrayList<Pedido> ventas = new ArrayList();

    // Constructor con parámetros

    public Venta(ArrayList<Pedido> ventas) {
        this.ventas = ventas;
    }

    public Venta() {
        ventas = new ArrayList();
    }

    // Método para buscar un pedido por código. Si no lo encuentra, muestra un mensaje.
    // CAMBIOS NECESARIOS DE A FUTURO
    public Pedido buscarCodigoPedido(int codigo) {
        for (Pedido v : ventas) {
            if (v.getNumeroPedido() == codigo) {
                return v;
            }
            System.out.println("No se encontro el pedido");
        }
        return null;
    }

    // Método para filtrar por clientes.
    public void filtrarClientes(String nombre) {
        ArrayList<Pedido> filtradoClientes = new ArrayList<>();
        for (Pedido pedido : ventas) {
            for (Cliente cliente : pedido.getClientes()) {
                if (cliente.getNombre().equals(nombre)) {
                    filtradoClientes.add(pedido);
                    break;
                }
            }
        }
    }

    // Método para calcular el precio de venta.

    public float calcularPrecioVenta() {
        float precioVenta = 0.0f;
        for (Pedido pedido : ventas) {
            for (LineaPedido linea : pedido.getLineaPedidos()){
                precioVenta +=  linea.getArticulo().getPrecio();
            }
        }
        return precioVenta;
    }
}
