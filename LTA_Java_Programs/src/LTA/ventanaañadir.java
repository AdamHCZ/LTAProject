package LTA;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

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
		contentPane.setLayout(null);
		contentPane.add(volvermenu);
		
		JLabel lblNewLabel = new JLabel("CON QUIEN DESEA INTERACTUAR?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 40));
		lblNewLabel.setBounds(152, 52, 635, 70);
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
		
		JButton ESTUDIANTE = new JButton("New button");
		ESTUDIANTE.setBounds(144, 134, 239, 316);
		contentPane.add(ESTUDIANTE);
		
		JButton TRABAJADOR = new JButton("New button");
		TRABAJADOR.setBounds(501, 134, 239, 316);
		contentPane.add(TRABAJADOR);
	}
}
