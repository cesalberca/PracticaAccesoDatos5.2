package es.cesalberca.practicaaccesodatos52.modelo;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by César
 */
public class Modelo {

    public final static String nombreDB = "XE";
    public final static String usuario = "HR";
    public final static String contrasena = "HR";

    public Modelo() throws SQLException, ClassNotFoundException {
        ConectorBD conectorBD = new ConectorBD(nombreDB, usuario, contrasena);
        conectorBD.inicarConexion();
        EmpleadoDao empleadoDao = new EmpleadoDaoImpl(conectorBD.getConexion());

        System.out.println("Consiguiendo empleados...");

        for (Empleado e : empleadoDao.getTodosEmpleados()) {
            System.out.println(e.toString());
        }

        conectorBD.cerrarConexion();
    }
}
