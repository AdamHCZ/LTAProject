package LTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

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
		setBackground(new Color(128, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton inicio = new JButton("INICIO");
		inicio.setBackground(new Color(0, 255, 255));
		inicio.setForeground(new Color(0, 0, 0));
		inicio.setFont(new Font("Cambria", Font.BOLD, 22));
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Crea y muestra la nueva ventana
	            ventanamenu menu = new ventanamenu();
	            menu.setVisible(true);
	            // Cierra la ventana actual
	            dispose();
			}
		});
		inicio.setBounds(330, 267, 307, 61);
		contentPane.add(inicio);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO A LTA");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 36));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(330, 164, 307, 93);
		contentPane.add(lblNewLabel);
	}
}
