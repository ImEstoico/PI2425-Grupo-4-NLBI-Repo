package tienda.dao;

import tienda.Model.Pedidos.Metodo_Pago;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Metodo_PagoDAO implements GenericDAO<Metodo_Pago, Integer> {

    @Override
    public void insertar(Metodo_Pago metodo_pago) {
        //Insertar más adelante
        return;
    }

    public Metodo_Pago obtenerPorCodigo(int codigo) {
        String sql = "SELECT * FROM metodo_pago WHERE codigo = ?";
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
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

    public List<Metodo_Pago> obtenerTodosMetodosPago() {
        List<Metodo_Pago> metodos_pago = new ArrayList<>();
        String sql = "SELECT * FROM metodo_pago";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                metodos_pago.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return metodos_pago;
    }

    @Override
    public void actualizar(Metodo_Pago metodo_pago) {
        //Actualizar más adelante
        return;
    }

    public void eliminar(int codigo) {
        //Eliminar más adelante
        return;
    }

    public Metodo_Pago obtenerPorDescripcion(String descripcion) {
        String sql = "SELECT * FROM metodo_pago WHERE descripcion = ?";
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, descripcion);
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
    public Metodo_Pago construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Metodo_Pago(
                rs.getInt("codigo"),
                rs.getString("descripcion")
        );
    }
}
