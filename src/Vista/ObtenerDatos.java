
package Vista;
import Modelo.Zoologico;
import Modelo.Leon;
import Modelo.Oso;
import Modelo.Zoologico;
import java.util.Scanner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ObtenerDatos extends JFrame {

    private JPanel contentPane;
    private Zoologico zoologico;

    public ObtenerDatos(Zoologico zoologico) {
        this.zoologico = zoologico;
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblBienvenidoAlSistema = new JLabel("Bienvenido al sistema de inventario de animales del zool\u00F3gico:");
        lblBienvenidoAlSistema.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblBienvenidoAlSistema.setBounds(10, 24, 414, 14);
        contentPane.add(lblBienvenidoAlSistema);

        JButton btnAnadirLeon = new JButton("Añadir león");
        btnAnadirLeon.setVerticalAlignment(SwingConstants.TOP);
        btnAnadirLeon.setFont(new Font("Sylfaen", Font.ITALIC, 14));
        btnAnadirLeon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zoologico.agregarAnimal("León");
                JOptionPane.showMessageDialog(null, "León añadido correctamente.");
            }
        });
        btnAnadirLeon.setBounds(147, 65, 144, 23);
        contentPane.add(btnAnadirLeon);

        JButton btnAnadirOso = new JButton("Añadir oso");
        btnAnadirOso.setVerticalAlignment(SwingConstants.TOP);
        btnAnadirOso.setFont(new Font("Sylfaen", Font.ITALIC, 14));
        btnAnadirOso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zoologico.agregarAnimal("Oso");
                JOptionPane.showMessageDialog(null, "Oso añadido correctamente.");
            }
        });
        btnAnadirOso.setBounds(147, 103, 144, 23);
        contentPane.add(btnAnadirOso);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setVerticalAlignment(SwingConstants.TOP);
        btnSalir.setForeground(new Color(255, 0, 0));
        btnSalir.setFont(new Font("Sylfaen", Font.ITALIC, 14));
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "El número de animales en el zoológico es: " + zoologico.getAnimales().size());
                System.exit(0);
            }
        });
        btnSalir.setBounds(147, 142, 144, 23);
        contentPane.add(btnSalir);
    }
}

