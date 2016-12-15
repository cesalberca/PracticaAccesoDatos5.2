package es.cesalberca.practicaaccesodatos52.vista;

import javax.swing.*;

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
        setContentPane(jpMain);
        setVisible(true);
    }
}
