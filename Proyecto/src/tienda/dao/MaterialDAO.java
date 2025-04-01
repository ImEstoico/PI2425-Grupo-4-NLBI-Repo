package tienda.dao;

import tienda.Model.Catalogo.Material;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAO implements GenericDAO<Material, Integer> {

    @Override
    public void insertar(Material material) {
        String sql = "INSERT INTO material (codigo, denominacion) VALUES ( ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, material.getDenominacion());
            stmt.setInt(2, material.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Material obtenerMaterialPorCodigo(Integer codigo) {
        String sql = "SELECT * FROM material WHERE codigo = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
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

    public Material obtenerMaterialPorDenominacion(String denominacion) {
        String sql = "SELECT * FROM material WHERE denominacion = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, denominacion);
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

    public List<Material> obtenerMateriales() {
        List<Material> materiales = new ArrayList<>();
        String sql = "SELECT * FROM material";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Material material = construirDesdeResultSet(rs);
                materiales.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return materiales;
    }

    @Override
    public void actualizar(Material material) {
        String sql = "UPDATE libro SET codigo = ?, denominacion = ? WHERE material = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, material.getDenominacion());
            stmt.setInt(2, material.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarDenominacion(String denominacion) {
        String sql = "DELETE FROM material WHERE denominacion = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, denominacion);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCodigo(int codigo) {
        String sql = "DELETE FROM material WHERE codigo = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(2, codigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Material construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Material(
                rs.getInt("Código"),
                rs.getString("Denominación")
                );
    }
}
