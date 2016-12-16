package es.cesalberca.practicaaccesodatos52.modelo;

import java.time.LocalDate;
import java.util.Date;
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

    public void crearEmpleado(int id, String nombre, String apellido, String email, String telefono, Date fechaContratacion, double salario) {
        System.out.println("Creando empleado...");

        Empleado e =  new Empleado();
        e.setId(id);
        e.setEmail(email);
        e.setNombre(nombre);
        e.setApellido(apellido);
        e.setTelefono(telefono);
        e.setFechaContratacion(fechaContratacion);
        e.setSalario(salario);

        empleadoDao.createEmpleado(e);
    }
}
