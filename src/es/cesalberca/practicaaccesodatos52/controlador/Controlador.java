package es.cesalberca.practicaaccesodatos52.controlador;

import es.cesalberca.practicaaccesodatos52.modelo.Modelo;
import es.cesalberca.practicaaccesodatos52.vista.Vista;

/**
 * Created by César
 */
public class Controlador {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
}
