package es.cesalberca.practicaaccesodatos52;

import es.cesalberca.practicaaccesodatos52.controlador.Controlador;
import es.cesalberca.practicaaccesodatos52.modelo.ConectorBD;
import es.cesalberca.practicaaccesodatos52.modelo.Modelo;
import es.cesalberca.practicaaccesodatos52.vista.Vista;

import java.sql.SQLException;

public class Main {

    public final static String nombreDB =  "XE";
    public final static String usuario = "HR";
    public final static String contrasena = "HR";

    public static void main(String[] args) {

        ConectorBD conectorBD = null;

        try {
            conectorBD = new ConectorBD(nombreDB, usuario, contrasena);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            if (conectorBD != null) {
                conectorBD.inicarConexion();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conectorBD != null) {
                conectorBD.test();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
    }
}
