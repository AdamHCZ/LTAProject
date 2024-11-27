package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ventanainicio extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventanainicio frame = new ventanainicio();
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
    public ventanainicio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 975, 570);

        // Panel principal con BorderLayout
        contentPane = new JPanel(new BorderLayout());
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20)); // Márgenes alrededor del contenido
        setContentPane(contentPane);

        // Panel central con GridBagLayout para centrar los elementos
        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(new Color(0, 0, 255));
        contentPane.add(centerPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20); // Espaciado entre componentes
        gbc.gridx = 0; // Columna
        gbc.weightx = 1.0; // Escalabilidad horizontal
        gbc.weighty = 1.0; // Escalabilidad vertical
        gbc.anchor = GridBagConstraints.CENTER;

        // Etiqueta de bienvenida
        JLabel lblNewLabel = new JLabel("BIENVENIDO A LTA");
        lblNewLabel.setFont(new Font("Candara", Font.BOLD, 36));
        lblNewLabel.setForeground(Color.WHITE);
        gbc.gridy = 0; // Fila 0
        centerPanel.add(lblNewLabel, gbc);

        // Botón de inicio
        JButton inicio = new JButton("INICIO");
        inicio.setBackground(new Color(0, 255, 255));
        inicio.setForeground(Color.BLACK);
        inicio.setFont(new Font("Cambria", Font.BOLD, 22));
        inicio.setPreferredSize(new Dimension(200, 50)); // Tamaño preferido para mantener estética
        inicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crea y muestra la nueva ventana
                ventanamenu menu = new ventanamenu();
                menu.setVisible(true);
                // Cierra la ventana actual
                dispose();
            }
        });

        gbc.gridy = 1; // Fila 1 para el botón
        centerPanel.add(inicio, gbc);
    }
}
