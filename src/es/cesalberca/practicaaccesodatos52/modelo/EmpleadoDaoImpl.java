package es.cesalberca.practicaaccesodatos52.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cesar
 */
public class EmpleadoDaoImpl implements EmpleadoDao {

    private ConectorBD conectorBD;

    public EmpleadoDaoImpl() {
        try {
            conectorBD = new ConectorBD();
            System.out.println("Conectado a la base de datos");
        } catch (ClassNotFoundException e) {
            System.out.println("No ha sido posible conectarse a la base de datos");
        }
    }

    @Override
    public List<Empleado> getTodosEmpleados() {
        Connection conexion = null;
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;

        try {
            Empleado empleado;
            List<Empleado> empleados = new ArrayList<>();

            conexion = conectorBD.crearNuevaConexion();
            preparedStatement = conexion.prepareStatement("SELECT * FROM EMPLOYEES");
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                empleado = new Empleado();
                empleado.setId(rs.getInt("EMPLOYEE_ID"));
                empleado.setNombre(rs.getString("FIRST_NAME"));
                empleado.setApellido(rs.getString("LAST_NAME"));
                empleado.setTelefono(rs.getString("PHONE_NUMBER"));
                empleado.setFechaContratacion(rs.getDate("HIRE_DATE"));
                empleado.setSalario(rs.getDouble("SALARY"));
                empleados.add(empleado);
            }

            conectorBD.cerrarConexion();
            return empleados;
        } catch (SQLException ex) {
            System.out.println("Error al conseguir la lista de empleados. Error: " + ex);
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
            if (conexion != null) try { conexion.close(); } catch (SQLException ignore) {}
        }
        return  null;
    }

    @Override
    public Empleado getEmpleado(int id) {
        return null;
    }

    @Override
    public void updateEmpleado(Empleado student) {

    }

    @Override
    public void deleteEmpleado(Empleado student) {

    }
}
