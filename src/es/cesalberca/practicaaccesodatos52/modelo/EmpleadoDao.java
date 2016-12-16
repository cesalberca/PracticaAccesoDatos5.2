package es.cesalberca.practicaaccesodatos52.modelo;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Cesar
 */
public interface EmpleadoDao {
    List<Empleado> getTodosEmpleados();
    Empleado getEmpleado(int id);
    void createEmpleado(Empleado empleado);
    void updateEmpleado(Empleado empleado);
    void deleteEmpleado(Empleado empleado);
}
