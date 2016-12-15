package es.cesalberca.practicaaccesodatos52.controlador;

import es.cesalberca.practicaaccesodatos52.modelo.GestorApp;
import es.cesalberca.practicaaccesodatos52.vista.AppVista;
import es.cesalberca.practicaaccesodatos52.vista.Vista;

/**
 * Created by César
 */
public class AppControlador {
    private AppVista vista;
    private GestorApp gestorApp;

    public AppControlador(AppVista vista, GestorApp gestorApp) {
        this.vista = vista;
        this.gestorApp = gestorApp;
    }
}
