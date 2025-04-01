package tienda.dao;

import tienda.Model.Articulos.Articulo;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticuloDAO implements GenericDAO<Articulo, Integer> {

    @Override
    public void insertar(Articulo articulo) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public Articulo obtenerPorId(Integer id) {
        String sql = "SELECT * FROM articulo WHERE id = ?";
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
    public List<Articulo> obtenerTodos() {
        List<Articulo> articulos = new ArrayList<>();
        String sql = "SELECT * FROM articulo";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                articulos.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articulos;
    }

    @Override
    public void actualizar(Articulo articulo) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public void eliminar(Integer id) {
        // TODO: Implementar este método más adelante
        return;
    }

    @Override
    public Articulo construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Articulo(
                rs.getString("codigoArticulo")
                , rs.getString("nombre")
                , rs.getFloat("precio")
                , rs.getString("marca")
                , rs.getString("descripcion")
                , rs.getString("imagen")
                , rs.getBoolean("activo")
                , rs.getString("color")
                , MaterialDAO.obtenerMaterialPorDenominacion(rs.getString("material"))
        );
    }
}