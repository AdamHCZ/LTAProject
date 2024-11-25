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
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class ventanacrearcurso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanacrearcurso frame = new ventanacrearcurso();
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
	public ventanacrearcurso() {
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 569);
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
		
		JLabel lblNewLabel = new JLabel("PARALELO:");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 132, 213, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblCosto = new JLabel("COSTO:");
		lblCosto.setFont(new Font("Cambria", Font.BOLD, 30));
		lblCosto.setBounds(10, 203, 144, 26);
		contentPane.add(lblCosto);
		
		JLabel lblCupos = new JLabel("CUPOS:");
		lblCupos.setFont(new Font("Cambria", Font.BOLD, 30));
		lblCupos.setBounds(10, 245, 144, 46);
		contentPane.add(lblCupos);
		
		JLabel lblDocente = new JLabel("DOCENTE:");
		lblDocente.setFont(new Font("Cambria", Font.BOLD, 30));
		lblDocente.setBounds(10, 298, 144, 46);
		contentPane.add(lblDocente);
		
		JLabel lblNuevoCurso = new JLabel("NUEVO CURSO");
		lblNuevoCurso.setFont(new Font("Cambria", Font.BOLD, 40));
		lblNuevoCurso.setBounds(339, 64, 274, 46);
		contentPane.add(lblNuevoCurso);
		
		JLabel lblPrecencial = new JLabel("MODALIDAD:");
		lblPrecencial.setFont(new Font("Cambria", Font.BOLD, 30));
		lblPrecencial.setBounds(10, 373, 213, 65);
		contentPane.add(lblPrecencial);
		
		JList list = new JList();
		list.setBounds(100, 354, 1, 1);
		contentPane.add(list);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 248, 738, 43);
		contentPane.add(textField_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(181, 132, 738, 43);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 190, 738, 43);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(181, 303, 738, 43);
		contentPane.add(textField_3);
		
		JRadioButton rdbtnPrecencial = new JRadioButton("PRECENCIAL");
		rdbtnPrecencial.setBounds(237, 382, 168, 46);
		contentPane.add(rdbtnPrecencial);
		
		JRadioButton rdbtnVirtual = new JRadioButton("VIRTUAL");
		rdbtnVirtual.setBounds(459, 382, 168, 46);
		contentPane.add(rdbtnVirtual);
	}
}
