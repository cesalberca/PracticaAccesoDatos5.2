package es.cesalberca.practicaaccesodatos52.controlador;

import es.cesalberca.practicaaccesodatos52.modelo.GestorApp;
import es.cesalberca.practicaaccesodatos52.vista.AppVista;
import es.cesalberca.practicaaccesodatos52.vista.CrearEmpleadoDialogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by César
 */
public class AppControlador {
    private AppVista vista;
    private GestorApp gestorApp;

    public AppControlador(AppVista vista, GestorApp gestorApp) {
        this.vista = vista;
        this.gestorApp = gestorApp;

        this.vista.addRefrescarListener(new RefrescarListener());
        this.vista.addCrearEmpleadoListener(new CrearEmpleadoListener());
    }

    public void crearEmpleado() {
        gestorApp.crearEmpleado();
    }

    private class RefrescarListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            vista.setTablaEmpleados(gestorApp.getEmpleados());
        }
    }

    private class CrearEmpleadoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CrearEmpleadoDialogo crearEmpleadoDialogo = new CrearEmpleadoDialogo(AppControlador.this);
        }
    }
}
