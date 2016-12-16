package es.cesalberca.practicaaccesodatos52.controlador;

import es.cesalberca.practicaaccesodatos52.modelo.GestorApp;
import es.cesalberca.practicaaccesodatos52.vista.AppVista;
import es.cesalberca.practicaaccesodatos52.vista.CrearEmpleadoDialogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

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

    public void crearEmpleado(String sid, String snombre, String sapellido, String semail, String stelefono, String sfechaContratacion, String ssalario) throws ParseException {
        int id = Integer.parseInt(sid);

        DateFormat format = new SimpleDateFormat("DD MM yyyy", Locale.ENGLISH);
        Date fechaContratacion = format.parse(sfechaContratacion);

        double salario = Double.parseDouble(ssalario);

        gestorApp.crearEmpleado(
                id,
                snombre,
                sapellido,
                semail,
                stelefono,
                fechaContratacion,
                salario
        );
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
