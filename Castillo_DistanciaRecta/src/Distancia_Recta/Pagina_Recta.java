package Distancia_Recta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Pagina_Recta extends JPanel {
    JTextField txtDistancia;
    JLabel lblTitulo, lblP1, lblP2, lblDistancia;
    JButton btnDistancia, btnLimpiar;

    Distancia_Recta.Recta straight = Distancia_Recta.General.straight;
    Distancia_Recta.Punto point = Distancia_Recta.General.point;

    public Pagina_Recta() {
        lblTitulo = new JLabel("Crear Recta");
        lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 30));
        lblP1 = new JLabel("Punto 1: (" + point.getX()+ ", " + point.getY() + ")");
        lblP2 = new JLabel("Punto 2: (" + point.getX1() + ", " + point.getY1() + ")");
        lblDistancia = new JLabel("La distancia es:");

        txtDistancia = new JTextField();
        
        btnDistancia = new JButton("Distancia");
        btnLimpiar = new JButton("Limpiar");
        
        this.setLayout(null);
        
        this.add(lblTitulo);
        this.add(lblP1);
        this.add(lblP2);            
        this.add(lblDistancia);            
        this.add(txtDistancia);
        this.add(btnDistancia);
        this.add(btnLimpiar);
                           
        lblTitulo.setBounds(300, -40, 300, 200);
        lblTitulo.setFont(new Font("Century Gothic", 2, 36));             
        lblTitulo.setForeground(Color.BLACK);
        lblP1.setBounds(100, 190, 500, 30);
        lblP1.setFont(new Font("Century Gothic", 2, 24)); 
        lblP1.setForeground(Color.BLACK);                      
        lblP2.setBounds(100, 250, 500, 30);
        lblP2.setFont(new Font("Century Gothic", 2, 24));             
        lblP2.setForeground(Color.BLACK);
        lblDistancia.setBounds(350, 190, 500, 30);
        lblDistancia.setFont(new Font("Century Gothic", 2, 24)); 
        lblDistancia.setForeground(Color.BLACK);                      
        
        txtDistancia.setBounds(350, 250, 200, 30);
        txtDistancia.setFont(new Font("Century Gothic", 2, 24));             
        txtDistancia.setForeground(Color.black);
        
        btnDistancia.setBounds(200, 350, 125, 35);
        btnDistancia.setFont(new Font("Century Gothic", 2, 14));
        btnDistancia.setBackground(Color.WHITE);

        btnDistancia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                txtDistancia.setEnabled(false);  
                int d = straight.distanBetweenPoints(point.getX(), point.getY(), point.getX1(), point.getY1()); 
                txtDistancia.setText(" " + d);
            }
        });   
        
        btnLimpiar.setBounds(400, 350, 145, 35);
        btnLimpiar.setFont(new Font("entury Gothic", 2, 14));  
        btnLimpiar.setBackground(Color.WHITE);

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  
                point.setX(0);
                point.setY(0);
                point.setX1(0);
                point.setY1(0);
                
                txtDistancia.setText("");
                lblP1.setText("Punto 1: (" + point.getX()+ ", " + point.getY() + ")");
                lblP2.setText("Punto 2: (" + point.getX1() + ", " + point.getY1() + ")");
            }
        }); 
        
        this.setBounds(150, 15, 800, 700);        
        this.setBackground(new Color(243, 243, 243)); 
    }
}
