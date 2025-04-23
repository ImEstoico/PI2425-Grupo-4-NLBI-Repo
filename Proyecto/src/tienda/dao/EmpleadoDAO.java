package tienda.dao;

import tienda.Model.Empleados.Empleado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO implements GenericDAO <Empleado, String>{

    @Override
    public void insertar(Empleado empleado) {
        //Insertar más adelante
        return;
    }

    public Empleado ObtenerEmpleadoPorDNI(String DNI) {
        String sql = "SELECT * FROM empleado WHERE DNI = ?";
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

    @Override
    public List<Empleado> obtenerTodos() {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM empleado";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                empleados.add(construirDesdeResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    @Override
    public void actualizar(Empleado empleado) {
        //Actualizar más adelante
        return;
    }

    public void eliminar(String DNI) {
        //Eliminar más adelante
        return;
    }

    public Empleado autenticarEmpleado(String Email, String pass) {
        String sql = "SELECT * FROM empleado WHERE Email = ? AND pass = ?";
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

    public Empleado obtenerPorEmail(String email) {
        String sql = "SELECT * FROM empleado WHERE email = ?";
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

    @Override
    public Empleado construirDesdeResultSet(ResultSet rs) throws SQLException {
        return new Empleado(
                rs.getString("DNI"),
                rs.getString("apellidos"),
                rs.getString("nombre"),
                rs.getInt("telefono"),
                rs.getString("direccion"),
                rs.getString("email"),
                rs.getBoolean("activo"),
                rs.getString("pass"),
                rs.getDate("f_nacimiento").toLocalDate(),
                rs.getBoolean("tienePrivilegios"),
                DepartamentoDAO.obtenerDepartamentoPorCodigo(rs.getInt("codigoDepartamento")));
    }
}
