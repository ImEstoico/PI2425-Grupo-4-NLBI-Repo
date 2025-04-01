package tienda.dao;

import tienda.Model.Articulos.Articulo;
import tienda.Model.Pedidos.LineaPedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LineaPedidoDAO implements GenericDAO<LineaPedido, Integer> {

    @Override
    public void insertar(LineaPedido obj) {
        return;
    }

    public LineaPedido obtenerPorNumeroPedido(Integer numPedido) {
        String sql = "SELECT * FROM LineaPedido WHERE num_pedido = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, numPedido);
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
    public List<LineaPedido> obtenerTodos() {
        // Lista para almacenar todas las líneas de pedido
        List<LineaPedido> lineasPedido = new ArrayList<>();
        String sql = "SELECT * FROM LineaPedido";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                LineaPedido linea = construirDesdeResultSet(rs); /
                lineasPedido.add(linea);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lineasPedido;
    }

    @Override
    public void actualizar(LineaPedido obj) {
        return;
    }

    public void eliminar(int numPedido) {
        return;
    }

    @Override
    public LineaPedido construirDesdeResultSet(ResultSet rs) throws SQLException {

        int numPedido = rs.getInt("num_pedido");
        int articuloId = rs.getInt("articulo_id");
        Articulo articulo = ArticuloDAO.obtenerPorId(articuloId);
        return new LineaPedido(numPedido, articulo);
    }
}