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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class ventanacrearcurso extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField cupos;
    private JTextField paralelo;
    private JTextField costo;
    private JTextField docente;

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
        contentPane.setLayout(null);

        JButton volvermenu = new JButton("volver");
        volvermenu.setBounds(10, 10, 99, 26);
        volvermenu.setForeground(new Color(0, 0, 0));
        volvermenu.setBackground(new Color(192, 192, 192));
        volvermenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanamenu menu = new ventanamenu();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.add(volvermenu);

        JLabel lblParalelo = new JLabel("PARALELO:");
        lblParalelo.setForeground(new Color(255, 255, 255));
        lblParalelo.setFont(new Font("Cambria", Font.BOLD, 30));
        lblParalelo.setBounds(10, 132, 159, 46);
        contentPane.add(lblParalelo);

        JLabel lblCosto = new JLabel("COSTO:");
        lblCosto.setForeground(new Color(255, 255, 255));
        lblCosto.setFont(new Font("Cambria", Font.BOLD, 30));
        lblCosto.setBounds(10, 203, 144, 26);
        contentPane.add(lblCosto);

        JLabel lblCupos = new JLabel("CUPOS:");
        lblCupos.setForeground(new Color(255, 255, 255));
        lblCupos.setFont(new Font("Cambria", Font.BOLD, 30));
        lblCupos.setBounds(10, 245, 144, 46);
        contentPane.add(lblCupos);

        JLabel lblDocente = new JLabel("DOCENTE:");
        lblDocente.setForeground(new Color(255, 255, 255));
        lblDocente.setFont(new Font("Cambria", Font.BOLD, 30));
        lblDocente.setBounds(10, 298, 144, 46);
        contentPane.add(lblDocente);

        JLabel lblNuevoCurso = new JLabel("NUEVO CURSO");
        lblNuevoCurso.setForeground(new Color(255, 255, 255));
        lblNuevoCurso.setFont(new Font("Cambria", Font.BOLD, 40));
        lblNuevoCurso.setBounds(339, 64, 274, 46);
        contentPane.add(lblNuevoCurso);

        JLabel lblModalidad = new JLabel("MODALIDAD:");
        lblModalidad.setForeground(new Color(255, 255, 255));
        lblModalidad.setFont(new Font("Cambria", Font.BOLD, 30));
        lblModalidad.setBounds(10, 373, 213, 65);
        contentPane.add(lblModalidad);

        paralelo = new JTextField();
        paralelo.setBounds(181, 132, 738, 43);
        contentPane.add(paralelo);
        paralelo.setColumns(10);

        costo = new JTextField();
        costo.setBounds(181, 190, 738, 43);
        contentPane.add(costo);
        costo.setColumns(10);

        cupos = new JTextField();
        cupos.setBounds(181, 248, 738, 43);
        contentPane.add(cupos);
        cupos.setColumns(10);

        docente = new JTextField();
        docente.setBounds(181, 303, 738, 43);
        contentPane.add(docente);
        docente.setColumns(10);

        JRadioButton precencial = new JRadioButton("PRECENCIAL");
        precencial.setFont(new Font("Cambria", Font.BOLD, 20));
        precencial.setBounds(237, 382, 168, 46);
        contentPane.add(precencial);

        JRadioButton virtual = new JRadioButton("VIRTUAL");
        virtual.setFont(new Font("Cambria", Font.BOLD, 20));
        virtual.setBounds(459, 382, 168, 46);
        contentPane.add(virtual);

        JButton aceptar = new JButton("aceptar");
        aceptar.setFont(new Font("Cambria", Font.BOLD, 20));
        aceptar.setBounds(368, 459, 245, 46);
        aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (paralelo.getText().trim().isEmpty() ||
                    costo.getText().trim().isEmpty() ||
                    cupos.getText().trim().isEmpty() ||
                    docente.getText().trim().isEmpty() ||
                    (!precencial.isSelected() && !virtual.isSelected())) {
                    JOptionPane.showMessageDialog(
                        ventanacrearcurso.this,
                        "Por favor, complete todos los campos y seleccione una modalidad.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE
                    );
                    return;
                } 
                
                if (!cupos.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "El campo 'CUPOS' debe contener solo números.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                if (!costo.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "El campo 'COSTO' debe contener solo números.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                
                vetajahorario menu = new vetajahorario();
                menu.setVisible(true);
                dispose();
            }
            
        });
        contentPane.add(aceptar);
    }
}

