
package bancoui;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BancoUI {

    private JFrame frame;
    private JButton btnRegistrarPersona;
    private JButton btnRegistrarTarjeta;
    private JButton btnMovimientosTarjeta;
    private JButton btnTarjetasCreadas;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BancoUI window = new BancoUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public BancoUI() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 0, 600, 50);
        frame.getContentPane().add(panel);

        btnRegistrarPersona = new JButton("Registrar Persona");
        btnRegistrarPersona.setBackground(Color.WHITE);
        btnRegistrarPersona.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistroPersonaUI Persona = new RegistroPersonaUI();
                Persona.setVisible(true);
            }
        });
        panel.add(btnRegistrarPersona);

        btnRegistrarTarjeta = new JButton("Registrar Tarjeta");
        btnRegistrarTarjeta.setBackground(Color.WHITE);
        btnRegistrarTarjeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                
                // Acciones a realizar al hacer clic en el botón Registrar Tarjeta
            }
        });
        panel.add(btnRegistrarTarjeta);

        btnMovimientosTarjeta = new JButton("Movimientos de la Tarjeta");
        btnMovimientosTarjeta.setBackground(Color.WHITE);
        btnMovimientosTarjeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
     
            }
        });
        panel.add(btnMovimientosTarjeta);

        btnTarjetasCreadas = new JButton("Tarjetas Creadas");
        btnTarjetasCreadas.setBackground(Color.WHITE);
        btnTarjetasCreadas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar al hacer clic en el botón Tarjetas Creadas
            }
        });
        panel.add(btnTarjetasCreadas);
    }
}


