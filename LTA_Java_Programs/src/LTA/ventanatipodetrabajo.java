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
        
        JButton docente = new JButton("DOCENTE");
        docente.setFont(new Font("Cambria", Font.BOLD, 30));
        docente.setBackground(new Color(255, 255, 255));
        docente.setBounds(10, 116, 293, 67);
        contentPane.add(docente);
        
        JButton director = new JButton("DIRECTOR");
        director.setFont(new Font("Cambria", Font.BOLD, 30));
        director.setBackground(Color.WHITE);
        director.setBounds(10, 193, 293, 67);
        contentPane.add(director);
        
        JButton limpieza = new JButton("LIMPIEZA");
        limpieza.setFont(new Font("Cambria", Font.BOLD, 30));
        limpieza.setBackground(Color.WHITE);
        limpieza.setBounds(10, 270, 293, 67);
        contentPane.add(limpieza);
        
        JButton mantenimiento = new JButton("MANTENIMIENTO");
        mantenimiento.setFont(new Font("Cambria", Font.BOLD, 30));
        mantenimiento.setBackground(Color.WHITE);
        mantenimiento.setBounds(10, 347, 293, 67);
        contentPane.add(mantenimiento);
        
        JButton administracion = new JButton("ADMINISTRACION");
        administracion.setFont(new Font("Cambria", Font.BOLD, 30));
        administracion.setBackground(Color.WHITE);
        administracion.setBounds(10, 424, 293, 67);
        contentPane.add(administracion);
        
        JButton guardar = new JButton("GUARDAR");
        guardar.setFont(new Font("Cambria", Font.BOLD, 30));
        guardar.setBackground(Color.WHITE);
        guardar.setBounds(697, 454, 254, 67);
        guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve la ventanamenu
                ventanarealizado menu = new ventanarealizado();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.add(guardar);
        
        
		
        
	}
}
