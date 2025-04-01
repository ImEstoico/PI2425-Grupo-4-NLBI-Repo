package tienda.dao;


import tienda.Model.Clientes.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements GenericDAO <Cliente, String> {

    @Override
    public void insertar(Cliente cliente) {
        //Insertar más adelante
        return;
    }

    public Cliente obtenerPorDNI(String DNI) {
        String sql = "SELECT * FROM cliente WHERE DNI = ?";
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, DNI);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return construirDesdeResultSet(rs);
                }
            }
        } catch (SQLException  e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Cliente> obtenerTodosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                clientes.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public void actualizar(Cliente cliente) {
        //Actualizar más adelante
        return;
    }

    public void eliminar(String DNI) {
        //Eliminar más adelante
        return;
    }

    public Cliente autenticarCliente(String Email, String pass) {
        String sql = "SELECT * FROM cliente WHERE Email = ? AND pass = ?";
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Email);
            stmt.setString(2, pass);
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

    public Cliente obtenerPorEmail(String email) {
        String sql = "SELECT * FROM cliente WHERE email = ?";
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
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

    public Cliente construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Cliente(
                rs.getString("DNI"),
                rs.getString("Apellidos"),
                rs.getString("Nombre"),
                rs.getInt("Telefono"),
                rs.getString("Direccion"),
                rs.getString("Email"),
                rs.getBoolean("Activo"),
                rs.getString("pass"),
                rs.getDate("f_nacimiento").toLocalDate(),
                rs.getString("numeroPedidos"),
                rs.getBoolean("tieneTarjetaFidelizacion"),
                rs.getString("direccionEnvio"),
                Metodo_PagoDAO.obtenerPorCodigo(rs.getInt("codigoMetodoPago"))
        );
    }
}
