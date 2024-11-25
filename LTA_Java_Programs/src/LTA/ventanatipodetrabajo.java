package LTA;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanatipodetrabajo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanatipodetrabajo frame = new ventanatipodetrabajo();
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
	public ventanatipodetrabajo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("TIPO DE TRABAJADOR");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		JButton volvertrabajo = new JButton("volver");
		volvertrabajo.setBounds(10, 10, 99, 26);
		volvertrabajo.setForeground(new Color(0, 0, 0));
		volvertrabajo.setBackground(new Color(192, 192, 192));
		volvertrabajo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve la ventanamenu
                ventanatrabajador menu = new ventanatrabajador();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.setLayout(null);
        contentPane.add(volvertrabajo);
        
        JLabel lblNewLabel_1 = new JLabel("TIPO DE TRABAJADOR");
        lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 40));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(257, 39, 414, 67);
        contentPane.add(lblNewLabel_1);
        
        JButton btnNewButton = new JButton("DOCENTE");
        btnNewButton.setFont(new Font("Cambria", Font.BOLD, 30));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(10, 116, 293, 67);
        contentPane.add(btnNewButton);
        
        JButton btnDirector = new JButton("DIRECTOR");
        btnDirector.setFont(new Font("Cambria", Font.BOLD, 30));
        btnDirector.setBackground(Color.WHITE);
        btnDirector.setBounds(10, 193, 293, 67);
        contentPane.add(btnDirector);
        
        JButton btnLimpieza = new JButton("LIMPIEZA");
        btnLimpieza.setFont(new Font("Cambria", Font.BOLD, 30));
        btnLimpieza.setBackground(Color.WHITE);
        btnLimpieza.setBounds(10, 270, 293, 67);
        contentPane.add(btnLimpieza);
        
        JButton btnMantenimiento = new JButton("MANTENIMIENTO");
        btnMantenimiento.setFont(new Font("Cambria", Font.BOLD, 30));
        btnMantenimiento.setBackground(Color.WHITE);
        btnMantenimiento.setBounds(10, 347, 293, 67);
        contentPane.add(btnMantenimiento);
        
        JButton btnAdministracion = new JButton("ADMINISTRACION");
        btnAdministracion.setFont(new Font("Cambria", Font.BOLD, 30));
        btnAdministracion.setBackground(Color.WHITE);
        btnAdministracion.setBounds(10, 424, 293, 67);
        contentPane.add(btnAdministracion);
        
	}
}
