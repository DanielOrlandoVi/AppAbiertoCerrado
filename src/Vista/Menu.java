package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Modelo.Zoologico;

public class Menu extends JFrame {
	 private JPanel contentPane;
	  private Zoologico zoo;
	 
	public Menu() {
	        zoo = new Zoologico();
	        initialize();
	    }

	    private void initialize() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);
	        contentPane = new JPanel();
	        contentPane.setBackground(new Color(192, 192, 192));
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JLabel lblBienvenido = new JLabel("Bienvenido al sistema de inventario de animales del zoológico:");
	        lblBienvenido.setBounds(20, 54, 414, 14);
	        lblBienvenido.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        contentPane.add(lblBienvenido);

	        JButton btnObtenerDatos = new JButton("Obtener Datos");
	        btnObtenerDatos.setVerticalAlignment(SwingConstants.TOP);
	        btnObtenerDatos.setBounds(151, 114, 135, 23);
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
	        JButton btnSalir = new JButton("Salir");
	        btnSalir.setVerticalAlignment(SwingConstants.TOP);
	        btnSalir.setForeground(new Color(255, 0, 0));
	        btnSalir.setFont(new Font("Sylfaen", Font.ITALIC, 14));
	        btnSalir.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(null,
	                        "Gracias por utilizar nuestro programa");
	                System.exit(0);
	            }
	        });
	        btnSalir.setBounds(151, 166, 144, 23);
	        contentPane.add(btnSalir);
	    }
}
