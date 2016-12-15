package es.cesalberca.practicaaccesodatos52.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by Cesar
 */
public class AppVista extends JFrame {
    private JTable jtEmpleados;
    private JPanel jpMain;
    private JButton crearEmpleadoButton;
    private JButton borrarEmpleadosButton;
    private JButton refrescarButton;
    private JPanel jpCabecera;
    private JPanel jpFooter;

    public AppVista() {
        super("Práctica 5.3");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(500, 600);
        setContentPane(jpMain);
        setVisible(true);

        String col[] = {"Id empleado", "Nombre", "Apellido", "Teléfono", "Salario", "Fecha de contratación"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        jtEmpleados.setModel(tableModel);
    }
}
