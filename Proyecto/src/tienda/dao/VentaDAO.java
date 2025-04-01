package tienda.dao;

import tienda.Model.Pedidos.Pedido;
import tienda.Model.Ventas.Venta;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VentaDAO implements GenericDAO<Venta, Integer> {

    @Override
    public void insertar(Venta obj) {
        return;
    }

    public Venta obtenerPorNumeroPedido(Integer numeroPedido) {
        // SQL para obtener una venta por su número de pedido
        String sql = "SELECT * FROM Venta WHERE numeroPedido = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, numeroPedido);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return construirDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Venta> obtenerTodos() {
        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM Venta";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Venta venta = construirDesdeResultSet(rs);
                ventas.add(venta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ventas;
    }

    @Override
    public void actualizar(Venta obj) {
        return;
    }

    public void eliminar(int numeroPedido) {
        return;
    }

    @Override
    public Venta construirDesdeResultSet(ResultSet rs) throws SQLException {

        ArrayList<Pedido> pedidos = new ArrayList<>();
        return new Venta(pedidos);
    }
}
