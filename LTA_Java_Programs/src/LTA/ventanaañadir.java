package LTA;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ventanaañadir extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventanaañadir frame = new ventanaañadir();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ventanaañadir() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 972, 565);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton volvermenu = new JButton("volver");
        volvermenu.setBounds(10, 10, 99, 26);
        volvermenu.setForeground(new Color(0, 0, 0));
        volvermenu.setBackground(new Color(192, 192, 192));
        volvermenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve la ventanamenu
                ventanamenu menu = new ventanamenu();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.add(volvermenu);

        JLabel lblNewLabel = new JLabel("CON QUIEN DESEA INTERACTUAR?");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 40));
        lblNewLabel.setBounds(133, 48, 635, 70);
        contentPane.add(lblNewLabel);

        JLabel lblEstudiante = new JLabel("ESTUDIANTE");
        lblEstudiante.setForeground(new Color(255, 255, 255));
        lblEstudiante.setFont(new Font("Cambria", Font.BOLD, 40));
        lblEstudiante.setBounds(144, 446, 253, 70);
        contentPane.add(lblEstudiante);

        JLabel lblMaestro = new JLabel("TRABAJADOR");
        lblMaestro.setForeground(new Color(255, 255, 255));
        lblMaestro.setFont(new Font("Cambria", Font.BOLD, 40));
        lblMaestro.setBounds(489, 446, 283, 70);
        contentPane.add(lblMaestro);

        // Botón Estudiante con imagen
        ImageIcon estudianteIcon = new ImageIcon(getClass().getResource("/imagenes/estudiante.png"));
        Image estudianteImg = estudianteIcon.getImage().getScaledInstance(239, 316, Image.SCALE_SMOOTH);
        estudianteIcon = new ImageIcon(estudianteImg);

        JButton ESTUDIANTE = new JButton(estudianteIcon);
        ESTUDIANTE.setForeground(new Color(255, 255, 255));
        ESTUDIANTE.setBackground(new Color(255, 255, 255));
        ESTUDIANTE.setBounds(144, 134, 239, 316);
        ESTUDIANTE.setContentAreaFilled(false); // Fondo transparente
        //ESTUDIANTE.setBorderPainted(false); // Quita el borde
        ESTUDIANTE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// PASAR A ESTUDIANTE
            	ventanaestudiante estudiante = new ventanaestudiante();
            	estudiante.setVisible(true);
                dispose();
            }
            
        });
        contentPane.add(ESTUDIANTE);

        // Botón Trabajador con imagen
        ImageIcon trabajadorIcon = new ImageIcon(getClass().getResource("/imagenes/trabajador.png"));
        Image trabajadorImg = trabajadorIcon.getImage().getScaledInstance(239, 316, Image.SCALE_SMOOTH);
        trabajadorIcon = new ImageIcon(trabajadorImg);

        JButton TRABAJADOR = new JButton(trabajadorIcon);
        TRABAJADOR.setBackground(new Color(0, 0, 255));
        TRABAJADOR.setBounds(501, 134, 239, 316);
        TRABAJADOR.setContentAreaFilled(false); // Fondo transparente
        //TRABAJADOR.setBorderPainted(false); // Quita el borde
        TRABAJADOR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// PASAR A TRABAJADOR
				ventanatrabajador trabajador = new ventanatrabajador();
				trabajador.setVisible(true);
                dispose();
            }
        });
        contentPane.add(TRABAJADOR);
    }
}