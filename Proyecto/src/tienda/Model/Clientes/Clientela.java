package tienda.Model.Clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clientela {
    private List<Cliente> clientes;

    public Clientela() {
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    // CRUD methods
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getCliente(String dni) {
        return clientes.stream()
                .filter(cliente -> cliente.getDni().equals(dni))
                .findFirst()
                .orElse(null);
    }

    public void updateCliente(Cliente cliente) {
        Cliente existingCliente = getCliente(cliente.getDni());
        if (existingCliente != null) {
            existingCliente.setNombre(cliente.getNombre());
            existingCliente.setApellidos(cliente.getApellidos());
            existingCliente.setMetodoPago(cliente.getMetodoPago());
        }
    }

    public void deleteCliente(String dni) {
        clientes.removeIf(cliente -> cliente.getDni().equals(dni));
    }

    // Search methods
    public Cliente buscarPorDni(String dni) {
        return getCliente(dni);
    }

    public List<Cliente> filtrarPorMetodoPago(String metodoPago) {
        return clientes.stream()
                .filter(cliente -> cliente.getMetodoPago().equals(metodoPago))
                .collect(Collectors.toList());
    }

    public List<Cliente> filtrarPorNombreYApellidos(String nombre, String apellidos) {
        return clientes.stream()
                .filter(cliente -> cliente.getNombre().equals(nombre) && cliente.getApellidos().equals(apellidos))
                .collect(Collectors.toList());
    }
}