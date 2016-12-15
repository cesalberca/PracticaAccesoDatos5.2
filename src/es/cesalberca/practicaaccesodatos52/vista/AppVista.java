package es.cesalberca.practicaaccesodatos52.vista;

import es.cesalberca.practicaaccesodatos52.modelo.Empleado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
    private DefaultTableModel tableModel;

    public AppVista() {
        super("Práctica 5.3");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setSize(500, 600);
        setContentPane(jpMain);
        setVisible(true);

        String col[] = {"Id empleado", "Nombre", "Apellido", "Teléfono", "Salario", "Fecha de contratación"};
        tableModel = new DefaultTableModel(col, 0);
        jtEmpleados.setModel(tableModel);
    }

    public void addRefrescarListener(ActionListener listener) {
        refrescarButton.addActionListener(listener);
    }

    // Esto no debería saber que es un empleado
    public void setTablaEmpleados(List<Empleado> tablaEmpleados) {
        for (Empleado empleado : tablaEmpleados) {
            tableModel.addRow(new Object[]{
                empleado.getId(),
                empleado.getNombre(),
                empleado.getApellido(),
                empleado.getTelefono(),
                empleado.getSalario(),
                empleado.getFechaContratacion()
            });
        }
        jtEmpleados.setModel(tableModel);
    }
}
