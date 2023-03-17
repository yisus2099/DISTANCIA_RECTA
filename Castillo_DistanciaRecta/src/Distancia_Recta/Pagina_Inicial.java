package Distancia_Recta;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Pagina_Inicial extends JPanel {

    JLabel lblTitulo;

    public Pagina_Inicial() {
        
        lblTitulo = new JLabel("Calcular distancia entre dos puntos");

        lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 30));
        lblTitulo.setForeground(new Color(91, 53, 91));

        lblTitulo.setBorder(new EmptyBorder(30, 0, 0, 0));
        this.add(lblTitulo, BorderLayout.CENTER);

        JLabel lblImg = new JLabel();
        lblImg.setBounds(360, 700, 260, 260);

        ImageIcon image = new ImageIcon(getClass().getResource("/Images/distancia.jpg"));
        ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT));
        lblImg.setIcon(icon);
        this.add(lblImg);

        this.setBackground(new Color(243, 243, 243));
    }
}
