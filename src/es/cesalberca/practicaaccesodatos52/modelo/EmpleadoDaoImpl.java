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

    private Connection conexion;

    public EmpleadoDaoImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Empleado> getTodosEmpleados() throws SQLException {
        Empleado empleado = null;
        List<Empleado> empleados = new ArrayList<>();

        PreparedStatement preparedStatement = conexion.prepareStatement("SELECT * FROM EMPLOYEES");
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            empleado = new Empleado(
                    rs.getString("EMPLOYEE_ID"),
                    rs.getString("FIRST_NAME"),
                    rs.getString("LAST_NAME"),
                    rs.getString("PHONE_NUMBER"),
                    rs.getDouble("SALARY"),
                    rs.getDate("HIRE_DATE")
                    );
            System.out.println(empleado.toString());
            empleados.add(empleado);
        }

        return empleados;
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
