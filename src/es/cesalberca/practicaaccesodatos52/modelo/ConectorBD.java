package es.cesalberca.practicaaccesodatos52.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

//    public List hacerQuery(String query) {
//        List<?> resultadoQuery = new ArrayList<>();
//        ResultSet rs = null;
//        PreparedStatement preparedStatement = null;
//
//        try {
//            inicarConexion();
//            preparedStatement = conexion.prepareStatement(query);
//            rs = preparedStatement.executeQuery();
//
//            while (rs.next()) {
//                resultadoQuery.add(rs);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Error al hacer la query en la base de datos");
//        } finally {
//            if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
//            if (preparedStatement != null) try { preparedStatement.close(); } catch (SQLException ignore) {}
//            if (conexion != null) try { conexion.close(); } catch (SQLException ignore) {}
//        }
//
//        return resultadoQuery;
//    }

    public Connection crearNuevaConexion() throws SQLException {
        String url = DB_CONNECTION + nombreDB;
        conexion = DriverManager.getConnection(url, usuario, contrasena);
        return getConexion();
    }

    public void cerrarConexion() throws SQLException {
        if (conexion != null)
            conexion.close();
    }

    private Connection getConexion() {
        return conexion;
    }
}
