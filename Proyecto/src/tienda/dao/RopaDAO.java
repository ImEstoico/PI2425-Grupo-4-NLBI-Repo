package tienda.dao;

import tienda.Model.Articulos.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RopaDAO implements GenericDAO<Ropa, Integer> {
    @Override
    public void insertar(Ropa ropa) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public Ropa obtenerPorId(Integer id) {
        String sql = "SELECT * FROM ropa WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
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
    public List<Ropa> obtenerTodos() {
        List<Ropa> ropas = new ArrayList<>();
        String sql = "SELECT * FROM ropa";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                ropas.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ropas;
    }

    @Override
    public void actualizar(Ropa ropa) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public void eliminar(Integer id) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public Ropa construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Ropa(
                rs.getInt("codigoArticulo"),
                rs.getString("nombre"),
                rs.getFloat("precio"),
                rs.getString("marca"),
                rs.getString("descripcion"),
                rs.getString("imagen"),
                rs.getBoolean("activo"),
                rs.getString("color"),
                MaterialDAO.obtenerMaterialPorDenominacion(rs.getString("material")),
                rs.getString("talla"),
                rs.getString("tipoCierre"),
                rs.getString("tipoRopa"));
    }
}
