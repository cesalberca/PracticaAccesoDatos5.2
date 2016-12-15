package es.cesalberca.practicaaccesodatos52.modelo;

import java.util.List;

/**
 * Created by César
 */
public class GestorApp {

    public GestorApp() {
        EmpleadoDao empleadoDao = new EmpleadoDaoImpl();

        System.out.println("Consiguiendo empleados...");

        List<Empleado> empleados = empleadoDao.getTodosEmpleados();

        if (empleados.size() > 0) {
            for (Empleado e : empleados) {
                System.out.println(e.toString());
            }
        }
    }
}
