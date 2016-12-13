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

    private static final String DB_CONNECTION = "jdbc:oracle:thin:@//localhost:1521/XE";

    public ConectorBD(String nombreDB, String usuario, String contrasena) throws ClassNotFoundException {
        this.nombreDB = nombreDB;
        this.usuario = usuario;
        this.contrasena = contrasena;
        Class.forName("oracle.jdbc.OracleDriver");
    }

    public void inicarConexion() throws SQLException {
        String url = DB_CONNECTION;
        conexion = DriverManager.getConnection(url, usuario, contrasena);
    }

    public void cerrarConexion() throws SQLException {
        if (!conexion.isClosed())
            conexion.close();
    }

    public void test() throws SQLException {
        String selectSQL = "SELECT * FROM EMPLOYEES WHERE USER_ID = ?";
        PreparedStatement preparedStatement = conexion.prepareStatement(selectSQL);
        preparedStatement.setInt(1, 100);
        ResultSet rs = preparedStatement.executeQuery(selectSQL );
        while (rs.next()) {
            String userid = rs.getString("FIRST_NAME");
            String username = rs.getString("LAST_NAME");
        }
    }

}
