
package bancoui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistroPersonaUI extends JFrame {

    private JLabel labelCURP;
    private JLabel labelNombre;
    private JLabel labelApellidoPaterno;
    private JLabel labelApellidoMaterno;
    private JLabel labelFechaNacimiento;

    private JTextField txtCURP;
    private JTextField txtNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
    private JTextField txtFechaNacimiento;

    private JButton btnRegistrar;
    private JButton btnLimpiar;

    private JPanel panel;

    public RegistroPersonaUI() {
        super("Registro de Persona");

        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 4));

        labelCURP = new JLabel("CURP:");
        panel.add(labelCURP);
        txtCURP = new JTextField();
        panel.add(txtCURP);

        labelNombre = new JLabel("Nombre:");
        panel.add(labelNombre);
        txtNombre = new JTextField();
        panel.add(txtNombre);

        labelApellidoPaterno = new JLabel("Apellido Paterno:");
        panel.add(labelApellidoPaterno);
        txtApellidoPaterno = new JTextField();
        panel.add(txtApellidoPaterno);

        labelApellidoMaterno = new JLabel("Apellido Materno:");
        panel.add(labelApellidoMaterno);
        txtApellidoMaterno = new JTextField();
        panel.add(txtApellidoMaterno);

        labelFechaNacimiento = new JLabel("Fecha de Nacimiento (dd/MM/yyyy):");
        panel.add(labelFechaNacimiento);
        txtFechaNacimiento = new JTextField();
        panel.add(txtFechaNacimiento);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar al hacer clic en el botón Registrar
                registrarPersona();
            }
        });
        panel.add(btnRegistrar);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar al hacer clic en el botón Limpiar
                limpiarFormulario();
            }
        });
        panel.add(btnLimpiar);

        add(panel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void registrarPersona() {
        // Obtener los datos de los campos de texto
        String curp = txtCURP.getText();
        String nombre = txtNombre.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String apellidoMaterno = txtApellidoMaterno.getText();
        String fechaNacimientoString = txtFechaNacimiento.getText();

        // Validar que los campos no estén vacíos
        if (curp.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty() || fechaNacimientoString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos obligatorios (*)");
            return;
        }

        // Convertir la fecha de nacimiento a un objeto Date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = formatter.parse(fechaNacimientoString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento debe tener el formato dd/MM/yyyy");
            return;
        }

        // Crear un objeto de la clase Persona con los datos del formulario
        Persona persona = new Persona(curp, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
                // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Persona registrada exitosamente:\n" + persona.toString());

        // Limpiar los campos del formulario
        limpiarFormulario();
    }

    private void limpiarFormulario() {
        txtCURP.setText("");
        txtNombre.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtFechaNacimiento.setText("");
    }

    public static void main(String[] args) {
        new RegistroPersonaUI();
    }

    // Clase interna para representar a una persona
    private class Persona {
        private String curp;
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private Date fechaNacimiento;

        public Persona(String curp, String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento) {
            this.curp = curp;
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.fechaNacimiento = fechaNacimiento;
        }

        public String getCurp() {
            return curp;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public Date getFechaNacimiento() {
            return fechaNacimiento;
        }

        public String toString() {
            return "CURP: " + curp + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellido Paterno: " + apellidoPaterno + "\n" +
                    "Apellido Materno: " + apellidoMaterno + "\n" +
                    "Fecha de Nacimiento: " + fechaNacimiento.toString();
        }
    }
}


        // TODO

