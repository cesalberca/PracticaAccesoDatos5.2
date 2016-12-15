package es.cesalberca.practicaaccesodatos52.modelo;

/**
 * Created by César
 */
public class GestorApp {

    public GestorApp() {
        EmpleadoDao empleadoDao = new EmpleadoDaoImpl();

        System.out.println("Consiguiendo empleados...");

        for (Empleado e : empleadoDao.getTodosEmpleados()) {
            System.out.println(e.toString());
        }
    }
}
