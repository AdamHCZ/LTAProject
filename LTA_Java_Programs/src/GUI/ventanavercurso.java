package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ventanavercurso extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventanavercurso frame = new ventanavercurso();
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
    public ventanavercurso() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 981, 569);

        // Panel principal con BorderLayout
        contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);

        // Panel superior para botón y combo box
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(0, 0, 255));
        contentPane.add(topPanel, BorderLayout.NORTH);

        // Botón "volver"
        JButton volvermenu = new JButton("volver");
        volvermenu.setForeground(Color.BLACK);
        volvermenu.setBackground(new Color(192, 192, 192));
        volvermenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanamenu menu = new ventanamenu();
                menu.setVisible(true);
                dispose();
            }
        });
        topPanel.add(volvermenu);

        // Combo box con lista de cursos
        String[] cursos = { "Matemáticas", "Ciencias", "Historia", "Arte", "Programación" };
        JComboBox<String> comboBoxCursos = new JComboBox<>(cursos);
        comboBoxCursos.setFont(new Font("Cambria", Font.PLAIN, 16));
        topPanel.add(comboBoxCursos);

        // Etiqueta "VISTA DE CURSOS" en el centro
        JLabel lblNewLabel = new JLabel("VISTA DE CURSOS", JLabel.CENTER);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 40));
        contentPane.add(lblNewLabel, BorderLayout.CENTER);
    }
}


