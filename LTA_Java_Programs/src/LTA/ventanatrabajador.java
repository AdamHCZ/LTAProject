package LTA;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class ventanatrabajador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField apellidopaterno;
	private JTextField apellidomaterno;
	private JTextField nombre;
	private JTextField fechadenacimiento;
	private JTextField telefono;
	private JTextField ci;
	private JTextField edad;
	private JTextField textField_7;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanatrabajador frame = new ventanatrabajador();
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
	public ventanatrabajador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton volverañadir = new JButton("volver");
		volverañadir.setBounds(10, 10, 99, 26);
		volverañadir.setForeground(new Color(0, 0, 0));
		volverañadir.setBackground(new Color(192, 192, 192));
		volverañadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve la ventanamenu
                ventanaañadir menu = new ventanaañadir();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.setLayout(null);
        contentPane.add(volverañadir);
        
        JLabel lblNewLabel = new JLabel("DATOS DEL TRABAJADOR");
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 35));
        lblNewLabel.setBounds(254, 47, 417, 78);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("NOMBRE:");
        lblNewLabel_1.setBackground(new Color(255, 255, 255));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel_1.setBounds(10, 132, 134, 50);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("APELLIDO:");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel_1_1.setBackground(Color.WHITE);
        lblNewLabel_1_1.setBounds(10, 194, 159, 50);
        contentPane.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("FECHA DE NACIMIENTO:");
        lblNewLabel_1_2.setForeground(Color.WHITE);
        lblNewLabel_1_2.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel_1_2.setBackground(Color.WHITE);
        lblNewLabel_1_2.setBounds(10, 256, 338, 50);
        contentPane.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_3 = new JLabel("CI:");
        lblNewLabel_1_3.setForeground(Color.WHITE);
        lblNewLabel_1_3.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel_1_3.setBackground(Color.WHITE);
        lblNewLabel_1_3.setBounds(10, 318, 37, 50);
        contentPane.add(lblNewLabel_1_3);
        
        JLabel correo = new JLabel("CORREO:");
        correo.setForeground(Color.WHITE);
        correo.setFont(new Font("Cambria", Font.BOLD, 30));
        correo.setBackground(Color.WHITE);
        correo.setBounds(10, 378, 134, 50);
        contentPane.add(correo);
        
        JLabel lblNewLabel_1_2_1 = new JLabel("TELEFONO:");
        lblNewLabel_1_2_1.setForeground(Color.WHITE);
        lblNewLabel_1_2_1.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel_1_2_1.setBackground(Color.WHITE);
        lblNewLabel_1_2_1.setBounds(608, 256, 159, 50);
        contentPane.add(lblNewLabel_1_2_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("PATERNO");
        lblNewLabel_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.BOLD, 20));
        lblNewLabel_1_1_1.setBackground(Color.WHITE);
        lblNewLabel_1_1_1.setBounds(170, 247, 159, 17);
        contentPane.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("MATERNO");
        lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_1_1.setFont(new Font("Cambria", Font.BOLD, 20));
        lblNewLabel_1_1_1_1.setBackground(Color.WHITE);
        lblNewLabel_1_1_1_1.setBounds(550, 247, 159, 17);
        contentPane.add(lblNewLabel_1_1_1_1);
        
        apellidopaterno = new JTextField();
        apellidopaterno.setColumns(10);
        apellidopaterno.setBounds(172, 194, 366, 41);
        contentPane.add(apellidopaterno);
        
        apellidomaterno = new JTextField();
        apellidomaterno.setColumns(10);
        apellidomaterno.setBounds(550, 194, 396, 41);
        contentPane.add(apellidomaterno);
        
        nombre = new JTextField();
        nombre.setColumns(10);
        nombre.setBounds(162, 137, 784, 41);
        contentPane.add(nombre);
        
        fechadenacimiento = new JTextField();
        fechadenacimiento.setColumns(10);
        fechadenacimiento.setBounds(352, 267, 238, 39);
        contentPane.add(fechadenacimiento);
        
        telefono = new JTextField();
        telefono.setColumns(10);
        telefono.setBounds(774, 268, 172, 39);
        contentPane.add(telefono);
        
        ci = new JTextField();
        ci.setColumns(10);
        ci.setBounds(65, 318, 362, 39);
        contentPane.add(ci);
        
        JLabel lblNewLabel_1_3_1 = new JLabel("EDAD:");
        lblNewLabel_1_3_1.setForeground(Color.WHITE);
        lblNewLabel_1_3_1.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel_1_3_1.setBackground(Color.WHITE);
        lblNewLabel_1_3_1.setBounds(448, 318, 90, 50);
        contentPane.add(lblNewLabel_1_3_1);
        
        edad = new JTextField();
        edad.setColumns(10);
        edad.setBounds(565, 318, 238, 39);
        contentPane.add(edad);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(154, 378, 784, 39);
        contentPane.add(textField_7);
        
        JButton guardar = new JButton("GUARDAR");
        guardar.setBackground(new Color(255, 255, 255));
        guardar.setFont(new Font("Cambria", Font.BOLD, 20));
        guardar.setBounds(371, 479, 216, 41);
        contentPane.add(guardar);
        
        JLabel lblSueldo = new JLabel("SUELDO:");
        lblSueldo.setForeground(Color.WHITE);
        lblSueldo.setFont(new Font("Cambria", Font.BOLD, 30));
        lblSueldo.setBackground(Color.WHITE);
        lblSueldo.setBounds(10, 431, 134, 50);
        contentPane.add(lblSueldo);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(154, 431, 784, 39);
        contentPane.add(textField);
	}
}
