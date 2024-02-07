
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
        lblBienvenidoAlSistema.setBounds(10, 11, 414, 14);
        contentPane.add(lblBienvenidoAlSistema);

        JButton btnAnadirLeon = new JButton("Añadir león");
        btnAnadirLeon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zoologico.agregarAnimal("León");
                JOptionPane.showMessageDialog(null, "León añadido correctamente.");
            }
        });
        btnAnadirLeon.setBounds(10, 36, 144, 23);
        contentPane.add(btnAnadirLeon);

        JButton btnAnadirOso = new JButton("Añadir oso");
        btnAnadirOso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zoologico.agregarAnimal("Oso");
                JOptionPane.showMessageDialog(null, "Oso añadido correctamente.");
            }
        });
        btnAnadirOso.setBounds(10, 70, 144, 23);
        contentPane.add(btnAnadirOso);

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "El número de animales en el zoológico es: " + zoologico.getAnimales().size());
                System.exit(0);
            }
        });
        btnSalir.setBounds(10, 104, 144, 23);
        contentPane.add(btnSalir);
    }
}

