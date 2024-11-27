package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ventanamenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventanamenu frame = new ventanamenu();
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
    public ventanamenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 973, 570);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Botón "volver"
        JButton volver = new JButton("volver");
        volver.setBounds(10, 10, 99, 26);
        volver.setForeground(new Color(0, 0, 0));
        volver.setBackground(new Color(192, 192, 192));
        volver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanainicio inicio = new ventanainicio();
                inicio.setVisible(true);
                dispose();
            }
        });
        contentPane.add(volver);

        // Etiqueta "QUE DESEA HACER?"
        JLabel lblNewLabel = new JLabel("QUE DESEA HACER?");
        lblNewLabel.setBounds(10, 32, 292, 91);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
        contentPane.add(lblNewLabel);

        // Botón "VER REGISTRO DE PERSONAS"
        JButton verpersonas = new JButton("VER REGISTRO DE PERSONAS");
        verpersonas.setBounds(31, 121, 430, 91);
        verpersonas.setFont(new Font("Cambria", Font.BOLD, 20));
        verpersonas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventaregistro registro = new ventaregistro();
                registro.setVisible(true);
                dispose();
            }
        });
        verpersonas.setBackground(new Color(255, 255, 255));
        contentPane.add(verpersonas);

        // Botón "VER CURSOS"
        JButton vercurso = new JButton("VER CURSOS");
        vercurso.setFont(new Font("Cambria", Font.BOLD, 20));
        vercurso.setBackground(new Color(255, 255, 255));
        vercurso.setBounds(31, 224, 430, 91); // Centramos el botón en el medio
        vercurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanavercurso curso = new ventanavercurso();
                curso.setVisible(true);
                dispose();
            }
        });
        contentPane.add(vercurso);

        // Botón "CREAR NUEVO CURSO"
        JButton nuevocurso = new JButton("CREAR NUEVO CURSO");
        nuevocurso.setBounds(31, 327, 430, 91);
        nuevocurso.setFont(new Font("Cambria", Font.BOLD, 20));
        nuevocurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanacrearcurso crear = new ventanacrearcurso();
                crear.setVisible(true);
                dispose();
            }
        });
        nuevocurso.setBackground(new Color(255, 255, 255));
        contentPane.add(nuevocurso);

        // Botón "AÑADIR O EDITAR USUARIOS"
        JButton editarusuario = new JButton("AÑADIR O EDITAR USUARIOS");
        editarusuario.setBounds(31, 430, 430, 91);
        editarusuario.setFont(new Font("Cambria", Font.BOLD, 20));
        editarusuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanaañadir añadir = new ventanaañadir();
                añadir.setVisible(true);
                dispose();
            }
        });
        editarusuario.setBackground(new Color(255, 255, 255));
        contentPane.add(editarusuario);

    }
}





