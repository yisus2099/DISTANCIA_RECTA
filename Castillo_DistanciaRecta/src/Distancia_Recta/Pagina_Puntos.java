package Distancia_Recta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pagina_Puntos extends JPanel {

    JTextField txtX, txtY, txtX1, txtY1;
    JLabel lblTitulo, lblPunto1, lblPunto2, lblX, lblY, lblX1, lblY1;
    JButton btn_create;

    Distancia_Recta.Punto point = Distancia_Recta.General.point;

    public Pagina_Puntos() {
        lblTitulo = new JLabel("Crear puntos");

        lblPunto1 = new JLabel("Punto 1");
        lblPunto2 = new JLabel("Punto 2");
        lblX = new JLabel("X1");
        lblY = new JLabel("Y1");
        lblX1 = new JLabel("X2");
        lblY1 = new JLabel("Y2");

        txtX = new JTextField();
        txtY = new JTextField();
        txtX1 = new JTextField();
        txtY1 = new JTextField();

        btn_create = new JButton("Crear");

        this.setLayout(null);

        this.add(lblTitulo);
        this.add(lblPunto1);
        this.add(lblPunto2);
        this.add(lblX);
        this.add(lblY);
        this.add(lblX1);
        this.add(lblY1);
        this.add(txtX);
        this.add(txtY);
        this.add(txtX1);
        this.add(txtY1);
        this.add(btn_create);

        lblTitulo.setBounds(300, -50, 300, 200);
        lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 36));
        lblTitulo.setForeground(Color.BLACK);
        lblPunto1.setBounds(120, 150, 150, 30);
        lblPunto1.setFont(new Font("Century Gothic", 2, 30));
        lblPunto1.setForeground(Color.BLACK);
        lblPunto2.setBounds(350, 150, 150, 30);
        lblPunto2.setFont(new Font("Century Gothic", 2, 30));
        lblPunto2.setForeground(Color.BLACK);
        
        lblX.setBounds(150, 195, 100, 30);
        lblX.setFont(new Font("Century Gothic", 2, 24));
        lblX.setForeground(Color.BLACK);
        lblY.setBounds(150, 255, 100, 30);
        lblY.setFont(new Font("Century Gothic", 2, 24));
        lblY.setForeground(Color.BLACK);
        
        lblX1.setBounds(350, 195, 100, 30);
        lblX1.setFont(new Font("Century Gothic", 2, 24));
        lblX1.setForeground(Color.BLACK);
        lblY1.setBounds(350, 255, 100, 30);
        lblY1.setFont(new Font("Calibri", 2, 24)); //aaaaaaaaaaaaaaaaaaaaaa 
        lblY1.setForeground(Color.BLACK);

        txtX.setBounds(190, 195, 100, 30);
        txtX.setForeground(Color.BLACK);
        txtX.setBackground(Color.white);
        txtY.setBounds(190, 255, 100, 30);
        txtY.setForeground(Color.BLACK);
        txtY.setBackground(Color.white);
        
        txtX1.setBounds(400, 195, 100, 30);
        txtX1.setForeground(Color.BLACK);
        txtX1.setBackground(Color.white);
        txtY1.setBounds(400, 255, 100, 30);
        txtY1.setForeground(Color.BLACK);
        txtY1.setBackground(Color.white);

        btn_create.setBounds(360, 540, 120, 30);
        btn_create.setFont(new Font("Georgia", 2, 14));
        btn_create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    point.setX(Integer.parseInt(txtX.getText()));
                    point.setY(Integer.parseInt(txtY.getText()));
                    point.setX1(Integer.parseInt(txtX1.getText()));
                    point.setY1(Integer.parseInt(txtY1.getText()));

                    JOptionPane.showMessageDialog(locate(320, 235), "Selecciona 'crear recta, porfavor :3'");

                    txtX.setText("");
                    txtY.setText("");
                    txtX1.setText("");
                    txtY1.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(locate(320, 235), "Hay espacios vacioooos ");
                }
            }
        });

        this.setBounds(150, 15, 800, 700);
        this.setBackground(new Color(243, 243, 243));
    }
}
