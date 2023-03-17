package Distancia_Recta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class Principal_Window extends JFrame {

    JPanel panelApp, panelButtons, panelWindows;
    JButton btnPpal, btnPag1, btnPag2;

    public Principal_Window() {
        btnPpal = new JButton("Inicio");
        btnPpal.setSize(180, 30);
        btnPpal.setFont(new Font("Century Gothic", 2, 14));
        btnPpal.setBackground(Color.WHITE);
        btnPpal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Inicial());
            }
        });

        btnPag1 = new JButton("Crear Puntos");
        btnPag1.setSize(180, 30);
        btnPag1.setFont(new Font("Century Gothic", 2, 14));
        btnPag1.setBackground(Color.WHITE);
        btnPag1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Puntos());
            }
        });

        btnPag2 = new JButton("Crear Recta");
        btnPag2.setSize(180, 30);
        btnPag2.setFont(new Font("Century Gothic", 2, 14));
        btnPag2.setBackground(Color.WHITE);
        btnPag2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showWindows(new Pagina_Recta());
            }
        });

        panelButtons = new JPanel();
        panelButtons.setBackground(new Color(91, 53, 91));
        panelButtons.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelButtons.add(btnPpal);
        panelButtons.add(btnPag1);
        panelButtons.add(btnPag2);
        panelWindows = new JPanel();
        panelWindows.setBackground(new Color(91, 53, 91));
        panelWindows.setLayout(new BorderLayout());

        showWindows(new Pagina_Inicial());

        panelApp = new JPanel();
        panelApp.setBackground(new Color(255, 255, 255));
        panelApp.setLayout(new BorderLayout());
        panelApp.add(panelButtons, BorderLayout.NORTH);
        panelApp.add(panelWindows, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(panelApp, BorderLayout.CENTER);

        this.setBounds(150, 30, 800, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void showWindows(JPanel window) {
        window.setSize(700, 10000);
        window.setLocation(0, 0);

        panelWindows.removeAll();
        panelWindows.add(window, BorderLayout.CENTER);
        panelWindows.revalidate();
        panelWindows.repaint();
    }

    public static void main(String args[]) {
        new Principal_Window().setVisible(true);
    }
}
