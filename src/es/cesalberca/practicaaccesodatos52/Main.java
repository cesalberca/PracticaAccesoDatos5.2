package es.cesalberca.practicaaccesodatos52;

import es.cesalberca.practicaaccesodatos52.controlador.Controlador;
import es.cesalberca.practicaaccesodatos52.modelo.ConectorBD;
import es.cesalberca.practicaaccesodatos52.modelo.Modelo;
import es.cesalberca.practicaaccesodatos52.vista.Vista;

public class Main {

    public static void main(String[] args) {
        ConectorBD conectorBD = new ConectorBD();
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
    }
}
