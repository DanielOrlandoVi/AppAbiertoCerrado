package Controlador;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Vista.ObtenerDatos;
import Modelo.Zoologico;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MainFrame extends JFrame {

    private JPanel contentPane;
    private Zoologico zoo;

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }

    public MainFrame() {
        zoo = new Zoologico();
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblBienvenido = new JLabel("Bienvenido al sistema de inventario de animales del zoológico:");
        lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBienvenido.setBounds(10, 11, 414, 14);
        contentPane.add(lblBienvenido);

        JButton btnObtenerDatos = new JButton("Obtener Datos");
        btnObtenerDatos.setBounds(148, 75, 135, 23);
        contentPane.add(btnObtenerDatos);
        
        btnObtenerDatos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ObtenerDatos datos = new ObtenerDatos(zoo);
                datos.setVisible(true);
				dispose();
                
                JOptionPane.showMessageDialog(null, "Animales en el zoológico: " + zoo.getAnimales());
            }
        });
    }
}
