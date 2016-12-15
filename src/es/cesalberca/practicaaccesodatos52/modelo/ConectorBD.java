package es.cesalberca.practicaaccesodatos52.modelo;

import java.sql.*;

/**
 * Created by César
 */
public class ConectorBD {
    private final static String nombreDB = "XE";
    private final static String usuario = "HR";
    private final static String contrasena = "HR";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@//localhost:1521/";

    private Connection conexion;

    public ConectorBD() throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    public void inicarConexion() throws SQLException {
        String url = DB_CONNECTION + nombreDB;
        conexion = DriverManager.getConnection(url, usuario, contrasena);
    }

    public void cerrarConexion() throws SQLException {
        if (!conexion.isClosed())
            conexion.close();
    }

    public Connection getConexion() {
        return conexion;
    }
}
