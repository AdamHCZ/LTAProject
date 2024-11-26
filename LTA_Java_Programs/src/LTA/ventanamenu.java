package LTA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ventanamenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanamenu frame = new ventanamenu();
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
	public ventanamenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("QUE DESEA HACER?");
		lblNewLabel.setBounds(10, 32, 292, 91);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
		
		JButton volver = new JButton("volver");
		volver.setBounds(10, 10, 99, 26);
		volver.setForeground(new Color(0, 0, 0));
		volver.setBackground(new Color(192, 192, 192));
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// vuelve la ventanainicio
				ventanainicio inicio = new ventanainicio();
                inicio.setVisible(true);
                dispose();
			}
		});
		
		JButton vercurso = new JButton("VER CURSOS");
		vercurso.setBounds(31, 430, 430, 91);
		vercurso.setFont(new Font("Cambria", Font.BOLD, 20));
		vercurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// va a ventanavercurso
				ventanavercurso curso = new ventanavercurso();
                curso.setVisible(true);
                dispose();
			}
		});
		vercurso.setBackground(new Color(255, 255, 255));
		
		JButton verpersonas = new JButton("VER REGISTRO DE PERSONAS");
		verpersonas.setBounds(31, 121, 430, 91);
		verpersonas.setFont(new Font("Cambria", Font.BOLD, 20));
		 verpersonas.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	//va a ventaregistro
	                ventaregistro registro = new ventaregistro();
	                registro.setVisible(true);
	                dispose();
	            }
	        });
		verpersonas.setBackground(new Color(255, 255, 255));
		
		JButton nuevocurso = new JButton("CREAR NUEVO CURSO");
		nuevocurso.setBounds(31, 327, 430, 91);
		nuevocurso.setFont(new Font("Cambria", Font.BOLD, 20));
		nuevocurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//va a ventanacrearcurso
				ventanacrearcurso crear = new ventanacrearcurso();
                crear.setVisible(true);
                dispose();
			}
		});
		nuevocurso.setBackground(new Color(255, 255, 255));
		
		JButton editarusuario = new JButton("AÑADIR O EDITAR USAUARIOS");
		editarusuario.setBounds(31, 224, 430, 91);
		editarusuario.setFont(new Font("Cambria", Font.BOLD, 20));
		editarusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//va a ventanaañadir
				 ventanaañadir añadir = new ventanaañadir();
	                añadir.setVisible(true);
	                dispose();
			}
		});
		editarusuario.setBackground(new Color(255, 255, 255));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(volver);
		contentPane.add(vercurso);
		contentPane.add(verpersonas);
		contentPane.add(nuevocurso);
		contentPane.add(editarusuario);
	}
}
