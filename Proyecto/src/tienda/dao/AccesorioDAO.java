package tienda.dao;

import tienda.Model.Articulos.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccesorioDAO implements GenericDAO<Accesorio, Integer> {
    @Override
    public void insertar(Accesorio accesorio) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public Accesorio obtenerPorId(Integer id) {
        String sql = "SELECT * FROM accesorio WHERE id = ?";
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
    public List<Accesorio> obtenerTodos() {
        List<Accesorio> accesorios = new ArrayList<>();
        String sql = "SELECT * FROM accesorio";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                accesorios.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accesorios;
    }

    @Override
    public void actualizar(Accesorio accesorio) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public void eliminar(Integer id) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public Accesorio construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Accesorio(
                rs.getInt("codigoArticulo"),
                rs.getString("nombre"),
                rs.getFloat("precio"),
                rs.getString("marca"),
                rs.getString("descripcion"),
                rs.getString("imagen"),
                rs.getBoolean("activo"),
                rs.getString("color"),
                MaterialDAO.obtenerMaterialPorDenominacion(rs.getString("material")),
                rs.getString("estilo"),
                rs.getBoolean("esPersonalizado"),
                rs.getString("tipoRopa"));
    }
}
