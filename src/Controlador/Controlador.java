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
import Vista.Menu;

public class Controlador extends JFrame {

    private JPanel contentPane;
    private Zoologico zoo;

    public static void main(String[] args) {
        Menu frame = new Menu();
        frame.setVisible(true);
    }

   
}
