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
import javax.swing.SwingConstants;

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
        lblBienvenido.setBounds(20, 54, 414, 14);
        lblBienvenido.setFont(new Font("Times New Roman", Font.BOLD, 14));
        contentPane.add(lblBienvenido);

        JButton btnObtenerDatos = new JButton("Obtener Datos");
        btnObtenerDatos.setVerticalAlignment(SwingConstants.TOP);
        btnObtenerDatos.setBounds(151, 154, 135, 23);
        btnObtenerDatos.setFont(new Font("Sylfaen", Font.ITALIC, 14));
        contentPane.add(btnObtenerDatos);
        
        JLabel lblNewLabel = new JLabel("Yader Ibraldo Quiroga Torres - 20222020034");
        lblNewLabel.setBounds(172, 236, 234, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblDanielOrlandoVillescas = new JLabel("Daniel Orlando Villescas Mora - 20221020065");
        lblDanielOrlandoVillescas.setBounds(172, 247, 234, 14);
        contentPane.add(lblDanielOrlandoVillescas);
        
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
