package GUI;

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
		
		JLabel lblNewLabel = new JLabel("VISTA DE CURSOS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 40));
		lblNewLabel.setBounds(322, 58, 339, 47);
		contentPane.add(lblNewLabel);
	}
}
