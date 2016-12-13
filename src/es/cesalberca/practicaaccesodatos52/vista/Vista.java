package es.cesalberca.practicaaccesodatos52.vista;

import javax.swing.*;
import java.awt.*;

/**
 * Created by César
 */
public class Vista extends JFrame {

    private JTable jtListadoEmpleados;

    public Vista() {
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        this.setTitle("Práctica 5.2");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel jpMain = new JPanel(new BorderLayout());

        // Menu
        JPanel jpMenu = new JPanel();
        jpMenu.setLayout(new BoxLayout(jpMenu, BoxLayout.LINE_AXIS));

        JButton jbCrearEmpleado = new JButton("Crear empleado");

        jpMenu.add(jbCrearEmpleado);
        jpMain.add(jpMenu, BorderLayout.NORTH);

        // Tabla empleados
        Object nombreColumnas[] = { "Column One", "Column Two", "Column Three" };
        Object datos[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
                { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };

        jtListadoEmpleados = new JTable(datos, nombreColumnas);
        JScrollPane jspListadoEmpleado = new JScrollPane(jtListadoEmpleados);
        jtListadoEmpleados.setFillsViewportHeight(true);

        jpMain.add(jspListadoEmpleado, BorderLayout.CENTER);

        this.add(jpMain);


        this.setVisible(true);

    }

}
