package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ventanatrabajador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField apellidopaterno;
	private JTextField apellidomaterno;
	private JTextField nombre;
	private JTextField fechadenacimiento;
	private JTextField telefono;
	private JTextField ci;
	private JTextField correoelectronico;
	private JTextField sueldo;
	int nrtipotrabajador;

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
        
        JLabel lblNewLabel_1_3_1 = new JLabel("TIPO DE TRABAJO");
        lblNewLabel_1_3_1.setForeground(Color.WHITE);
        lblNewLabel_1_3_1.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel_1_3_1.setBackground(Color.WHITE);
        lblNewLabel_1_3_1.setBounds(448, 318, 261, 50);
        contentPane.add(lblNewLabel_1_3_1);
        
     // Creación del JComboBox con las opciones de trabajos
        JComboBox<String> tipodetrabajo = new JComboBox<>();
        tipodetrabajo.setBounds(727, 318, 219, 44);
        contentPane.add(tipodetrabajo);

        // Agregar las opciones al JComboBox
        tipodetrabajo.addItem("Docente");
        tipodetrabajo.addItem("Director");
        tipodetrabajo.addItem("Limpieza");
        tipodetrabajo.addItem("Mantenimiento");
        tipodetrabajo.addItem("Administración");
//para que de un numero depende de que seleccione
        tipodetrabajo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String seleccionado = (String) tipodetrabajo.getSelectedItem();
                switch (seleccionado) {
                    case "Docente":
                    	nrtipotrabajador=1; 
                        break;
                    case "Director":
                    	nrtipotrabajador=2;
                    	break;
                    case "Limpieza":
                    	nrtipotrabajador=3;
                    	break;
                    case "Mantenimiento":
                    	nrtipotrabajador=4;
                    	break;
                    case "Administración":
                    	nrtipotrabajador=5;
                        break;
                    default:
                    	nrtipotrabajador=0;
                        break;
                }
            }
        });
        correoelectronico = new JTextField();
        correoelectronico.setColumns(10);
        correoelectronico.setBounds(154, 378, 784, 39);
        contentPane.add(correoelectronico);
        
        JButton guardar = new JButton("GUARDAR");
        guardar.setBackground(new Color(255, 255, 255));
        guardar.setFont(new Font("Cambria", Font.BOLD, 20));
        guardar.setBounds(371, 479, 216, 41);
        guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Validación de campos
                if (nombre.getText().isEmpty() || apellidopaterno.getText().isEmpty() || apellidomaterno.getText().isEmpty() ||
                    fechadenacimiento.getText().isEmpty() || telefono.getText().isEmpty() || ci.getText().isEmpty() ||
                     correoelectronico.getText().isEmpty() || sueldo.getText().isEmpty())  {

                    // Mostrar mensaje de error si algún campo está vacío
                    JOptionPane.showMessageDialog(
                        null, 
                        "Por favor, complete todos los campos antes de guardar.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                // Ve que telefono sean numeros
                if (!telefono.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "El campo 'Teléfono' debe contener solo números.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                //ve que el sueldo sea un numero
                if (!sueldo.getText().matches("\\d+(\\.\\d{1,2})?")) { // Sueldo debe ser un número decimal
                    JOptionPane.showMessageDialog(
                        null, 
                        "El campo 'Sueldo' debe contener un valor numérico válido (ej. 1000.50).", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                //ve que la fehca se lea bien
                if (!fechadenacimiento.getText().matches("\\d{4}-\\d{2}-\\d{2}")) { // Fecha en formato YYYY-MM-DD
                    JOptionPane.showMessageDialog(
                        null, 
                        "El campo 'Fecha de Nacimiento' debe estar en el formato YYYY-MM-DD.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                //ve que el ci este en numeros
                if (!ci.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "El campo 'CI' debe estar con numeros", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                //ve que este bien el correo 
                if (!correoelectronico.getText().endsWith("@gmail.com")) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "El campo 'Correo' debe ser una dirección de correo válida de Gmail (@gmail.com).", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                // Mostrar ventana de tipo de trabajo si todas las validaciones pasan
                ventanarealizado nuevaVentana = new ventanarealizado();
                nuevaVentana.setVisible(true); // Haz visible la nueva ventana
                dispose(); // Cierra la ventana actual
            }
        });

        contentPane.add(guardar);
        
        JLabel lblSueldo = new JLabel("SUELDO:");
        lblSueldo.setForeground(Color.WHITE);
        lblSueldo.setFont(new Font("Cambria", Font.BOLD, 30));
        lblSueldo.setBackground(Color.WHITE);
        lblSueldo.setBounds(10, 431, 134, 50);
        contentPane.add(lblSueldo);
        
        sueldo = new JTextField();
        sueldo.setColumns(10);
        sueldo.setBounds(154, 431, 784, 39);
        contentPane.add(sueldo);
        
        
	}
}
