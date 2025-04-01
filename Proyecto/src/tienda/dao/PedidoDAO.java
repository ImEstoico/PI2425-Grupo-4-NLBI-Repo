package tienda.dao;

import tienda.Model.Clientes.Cliente;
import tienda.Model.Pedidos.LineaPedido;
import tienda.Model.Pedidos.Metodo_Pago;
import tienda.Model.Pedidos.Pedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO implements GenericDAO<Pedido, Integer>{

    @Override
    public void insertar(Pedido obj) {
        return;
    }

    public Pedido obtenerPorNumeroPedido(Integer numeroPedido) {
        String sql = "SELECT * FROM Pedido WHERE numeroPedido = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, numeroPedido);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return construirDesdeResultSet(rs);
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Pedido> obtenerPedidosPorCliente (String DNI_cliente) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM Pedido WHERE DNI_cliente = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, DNI_cliente);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Pedido pedido = construirDesdeResultSet(rs);
                    pedidos.add(pedido);
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }

    @Override
    public List<Pedido> obtenerTodos(){
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM Pedido";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Pedido pedido = construirDesdeResultSet(rs);
                pedidos.add(pedido);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }

    @Override
    public void actualizar(Pedido obj) {
        return;
    }

    public void eliminar(int numeroPedido) {
        return;
    }

    @Override
    public Pedido construirDesdeResultSet(ResultSet rs) throws SQLException {
        int numeroPedido = rs.getInt("numeroPedido");
        Date fecha = rs.getDate("fecha");
        String dir_envio = rs.getString("dir_envio");
        String DNI_cliente = rs.getString("DNI_cliente");
        Metodo_Pago metodoPago = Metodo_PagoDAO.obtenerPorDescripcion(rs.getString("metodoPago"));
        ArrayList<LineaPedido> lineaPedidos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        return new Pedido(numeroPedido, fecha, dir_envio, DNI_cliente, metodoPago, lineaPedidos, clientes);
    }

}
