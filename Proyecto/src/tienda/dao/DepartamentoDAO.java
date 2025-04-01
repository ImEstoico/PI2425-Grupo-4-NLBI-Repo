package tienda.dao;

import tienda.Model.Empleados.Departamento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class DepartamentoDAO implements GenericDAO<Departamento, Integer> {

    @Override
    public void insertar(Departamento departamento) {
        // TODO: Implementar este método más adelante
        return;
    }

    public Departamento obtenerDepartamentoPorCodigo(Integer codigo) {
        String sql = "SELECT * FROM departamento WHERE codigo = ?";
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

    @Override
    public List<Departamento> obtenerTodos() {
        List<Departamento> departamentos = new ArrayList<>();
        String sql = "SELECT * FROM departamento";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                departamentos.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departamentos;
    }
    @Override
    public void actualizar(Departamento departamento) {
        // TODO: Implementar este método más adelante
        return;
    }

    public void eliminar(int codigo) {
        // TODO: Implementar este método más adelante
        return;
    }
    @Override
    public Departamento construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Departamento(
                rs.getInt("codigo"),
                rs.getString("nombre")
        );
    }
}
