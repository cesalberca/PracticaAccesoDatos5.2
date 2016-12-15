package es.cesalberca.practicaaccesodatos52.modelo;

import java.util.List;

/**
 * Created by César
 */
public class GestorApp {
    private EmpleadoDao empleadoDao;

    public GestorApp() {
        empleadoDao = new EmpleadoDaoImpl();
    }

    public List<Empleado> getEmpleados() {
        System.out.println("Consiguiendo empleados...");
        return empleadoDao.getTodosEmpleados();
    }
}
