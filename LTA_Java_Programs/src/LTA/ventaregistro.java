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

public class ventaregistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventaregistro frame = new ventaregistro();
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
	public ventaregistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton volvermenu = new JButton("volver");
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
		volvermenu.setBounds(10, 10, 99, 26);
		contentPane.add(volvermenu);
		
		JLabel lblNewLabel = new JLabel("CUADRO DE REGISTROS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 40));
		lblNewLabel.setBounds(248, 65, 446, 125);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("VER ESTUDIANTES");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.setBounds(105, 204, 271, 81);
		contentPane.add(btnNewButton);
		
		JButton btnVerTrabajadores = new JButton("VER TRABAJADORES");
		btnVerTrabajadores.setBackground(new Color(255, 255, 255));
		btnVerTrabajadores.setFont(new Font("Cambria", Font.BOLD, 20));
		btnVerTrabajadores.setBounds(556, 204, 271, 81);
		contentPane.add(btnVerTrabajadores);
		
		JButton btnVerDocentes = new JButton("VER DOCENTES");
		btnVerDocentes.setBackground(new Color(255, 255, 255));
		btnVerDocentes.setFont(new Font("Cambria", Font.BOLD, 20));
		btnVerDocentes.setBounds(336, 331, 271, 81);
		contentPane.add(btnVerDocentes);
		
		
	}
}
