package es.cesalberca.practicaaccesodatos52.vista;

import es.cesalberca.practicaaccesodatos52.controlador.AppControlador;

import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;

public class CrearEmpleadoDialogo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField jtFechaDeContratacion;
    private JTextField jtEmail;
    private JTextField jtNombre;
    private JTextField jtApellido;
    private JTextField jtTelefono;
    private JTextField jtSalario;
    private JTextField jtId;

    private AppControlador appControlador;

    public CrearEmpleadoDialogo(AppControlador appControlador) {
        this.appControlador = appControlador;

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(e -> onOK());

        buttonCancel.addActionListener(e -> onCancel());

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(e -> onCancel(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        pack();
        setVisible(true);
    }

    public void onOK() {
        try {
            appControlador.crearEmpleado(
                    jtId.getText(),
                    jtNombre.getText(),
                    jtApellido.getText(),
                    jtEmail.getText(),
                    jtTelefono.getText(),
                    jtFechaDeContratacion.getText(),
                    jtSalario.getText()
            );
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error de formateo de campos");
            System.out.println(e);
        }
        dispose();
    }

    public void onCancel() {
        dispose();
    }
}
