package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ventanacursorealizado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanacursorealizado frame = new ventanacursorealizado();
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
	public ventanacursorealizado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 566);
		contentPane = new JPanel(new GridBagLayout());
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10); // Espaciado entre los componentes
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		
		JLabel lblNewLabel = new JLabel("CURSO AÑADIDO");
		lblNewLabel.setBounds(240, 68, 430, 66);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 55));
		contentPane.add(lblNewLabel);
		
		// Botón para volver al menú principal
        JButton volvermenu = new JButton("VOLVER");
        volvermenu.setFont(new Font("Cambria Math", Font.BOLD, 30));
        volvermenu.setForeground(new Color(0, 0, 0));
        volvermenu.setBackground(new Color(192, 192, 192));
        volvermenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve a la ventanamenu
                ventanamenu menu = new ventanamenu();
                menu.setVisible(true);
                dispose();
            }
        });
        gbc.gridy = 1; // Aseguramos que el botón esté debajo de la etiqueta
		gbc.ipady = 10; // Aumentamos el tamaño del botón para hacerlo más visible
		contentPane.add(volvermenu, gbc);
	}

}
