package LTA;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.Font;

public class vetajahorario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vetajahorario frame = new vetajahorario();
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
	public vetajahorario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton volvercurso = new JButton("volver");
		volvercurso.setBounds(10, 10, 99, 26);
		volvercurso.setForeground(new Color(0, 0, 0));
		volvercurso.setBackground(new Color(192, 192, 192));
		volvercurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve la ventanamenu
                ventanacrearcurso menu = new ventanacrearcurso();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.setLayout(null);
        contentPane.add(volvercurso);
        
        JButton btnNewButton = new JButton("LUNES");
        btnNewButton.setFont(new Font("Dialog", Font.BOLD, 20));
        btnNewButton.setBounds(110, 60, 160, 57);
        contentPane.add(btnNewButton);
        
        JButton btnMertes = new JButton("MERTES");
        btnMertes.setFont(new Font("Dialog", Font.BOLD, 20));
        btnMertes.setBounds(271, 60, 160, 57);
        contentPane.add(btnMertes);
        
        JButton btnMiercoles = new JButton("MIERCOLES");
        btnMiercoles.setFont(new Font("Dialog", Font.BOLD, 20));
        btnMiercoles.setBounds(432, 60, 160, 57);
        contentPane.add(btnMiercoles);
        
        JButton btnJueves = new JButton("JUEVES");
        btnJueves.setFont(new Font("Dialog", Font.BOLD, 20));
        btnJueves.setBounds(593, 60, 160, 57);
        contentPane.add(btnJueves);
        
        JButton btnVierne = new JButton("VIERNES");
        btnVierne.setFont(new Font("Dialog", Font.BOLD, 20));
        btnVierne.setBounds(753, 60, 160, 57);
        contentPane.add(btnVierne);
        
        JButton btnNewButton_5 = new JButton("8:00-10:00");
        btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 12));
        btnNewButton_5.setBounds(10, 116, 99, 57);
        contentPane.add(btnNewButton_5);
        
        JButton btnNewButton_5_1 = new JButton("10:00-12:00");
        btnNewButton_5_1.setBounds(10, 173, 99, 57);
        contentPane.add(btnNewButton_5_1);
        
        JButton btnNewButton_5_2 = new JButton("14:00-16:00");
        btnNewButton_5_2.setBounds(10, 229, 99, 57);
        contentPane.add(btnNewButton_5_2);
        
        JButton btnNewButton_5_3 = new JButton("16:00-18:00");
        btnNewButton_5_3.setBounds(10, 286, 99, 57);
        contentPane.add(btnNewButton_5_3);
        
        JButton btnNewButton_5_4 = new JButton("18:00-20:00");
        btnNewButton_5_4.setBounds(10, 341, 99, 57);
        contentPane.add(btnNewButton_5_4);
        
        JButton btnNewButton_5_5 = new JButton("20:00-22:00");
        btnNewButton_5_5.setBounds(10, 397, 99, 57);
        contentPane.add(btnNewButton_5_5);
        
        JButton INGRESAR = new JButton("INGRESAR");
        INGRESAR.setFont(new Font("Cambria", Font.BOLD, 20));
        INGRESAR.setBounds(348, 480, 378, 40);
        INGRESAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve la ventanamenu
                ventanacursorealizado menu = new ventanacursorealizado();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.add(INGRESAR);
	}
}
