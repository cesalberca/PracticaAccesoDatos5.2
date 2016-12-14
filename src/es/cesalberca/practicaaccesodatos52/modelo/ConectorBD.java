package es.cesalberca.practicaaccesodatos52.modelo;

import java.sql.*;

/**
 * Created by César
 */
public class ConectorBD {
    private Connection conexion;
    private String nombreDB;
    private String usuario;
    private String contrasena;

    private static final String DB_CONNECTION = "jdbc:oracle:thin:@//localhost:1521/";

    public ConectorBD(String nombreDB, String usuario, String contrasena) throws ClassNotFoundException {
        this.nombreDB = nombreDB;
        this.usuario = usuario;
        this.contrasena = contrasena;
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
