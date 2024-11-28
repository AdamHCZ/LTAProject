package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ventanavercurso extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tblHorario;
    private JLabel lblInformacionCurso;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ventanavercurso frame = new ventanavercurso();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ventanavercurso() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 600);

        // Panel principal
        contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);

        // Panel superior
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(0, 0, 255));
        contentPane.add(topPanel, BorderLayout.NORTH);

        // Botón "volver"
        JButton volvermenu = new JButton("volver");
        volvermenu.setForeground(Color.BLACK);
        volvermenu.setBackground(new Color(192, 192, 192));
        volvermenu.setFont(new Font("SansSerif", Font.BOLD, 14));
        volvermenu.addActionListener(e -> {
            ventanamenu menu = new ventanamenu();
            menu.setVisible(true);
            dispose();
        });
        topPanel.add(volvermenu);

        // Combo box con lista de cursos
        String[] cursos = { "Matemáticas", "Ciencias", "Historia", "Arte", "Programación" };
        JComboBox<String> comboBoxCursos = new JComboBox<>(cursos);
        comboBoxCursos.setFont(new Font("Cambria", Font.PLAIN, 16));
        topPanel.add(comboBoxCursos);

        // Panel central con horario e información del curso
        JPanel mainPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        contentPane.add(mainPanel, BorderLayout.CENTER);

        // Panel del horario (izquierda)
        JPanel horarioPanel = new JPanel(new BorderLayout());
        horarioPanel.setBackground(Color.WHITE);
        mainPanel.add(horarioPanel);

        // Horario (tabla)
        String[] columnNames = { "Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        String[][] data = {
            { "8:00-10:00", "", "", "", "", "", "", "" },
            { "10:00-12:00", "", "", "", "", "", "", "" },
            { "14:00-16:00", "", "", "", "", "", "", "" },
            { "16:00-18:00", "", "", "", "", "", "", "" },
            { "18:00-20:00", "", "", "", "", "", "", "" },
            { "20:00-22:00", "", "", "", "", "", "", "" },
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Ninguna celda es editable
            }
        };

        tblHorario = new JTable(model);
        tblHorario.setFont(new Font("SansSerif", Font.PLAIN, 14));
        tblHorario.setRowHeight(40);
        tblHorario.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 16));
        JScrollPane scrollHorario = new JScrollPane(tblHorario);
        horarioPanel.add(scrollHorario, BorderLayout.CENTER);

        // Panel de información del curso (derecha)
        JPanel infoPanel = new JPanel(new BorderLayout());
        infoPanel.setBackground(Color.WHITE);
        mainPanel.add(infoPanel);

        lblInformacionCurso = new JLabel("Seleccione un curso para ver la información", JLabel.CENTER);
        lblInformacionCurso.setFont(new Font("Cambria", Font.PLAIN, 18));
        lblInformacionCurso.setForeground(Color.BLACK);
        infoPanel.add(lblInformacionCurso, BorderLayout.CENTER);

        // Evento para el combo box
        comboBoxCursos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cursoSeleccionado = (String) comboBoxCursos.getSelectedItem();
                actualizarHorarioYInformacion(cursoSeleccionado);
            }
        });
    }

    private void actualizarHorarioYInformacion(String curso) {
        // Actualizar horario según el curso seleccionado
        DefaultTableModel model = (DefaultTableModel) tblHorario.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 1; j < model.getColumnCount(); j++) {
                model.setValueAt("", i, j); // Limpia todas las celdas excepto las horas
            }
        }

        if ("Matemáticas".equals(curso)) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt("Ocupado", i, 1); // Lunes ocupado
            }
            lblInformacionCurso.setText("<html><h2>Matemáticas</h2><p>Curso de álgebra, geometría y cálculo.</p></html>");
        } else if ("Ciencias".equals(curso)) {
            model.setValueAt("Ocupado", 1, 2); // Martes 10:00-12:00 ocupado
            lblInformacionCurso.setText("<html><h2>Ciencias</h2><p>Curso de física, química y biología.</p></html>");
        } else if ("Historia".equals(curso)) {
            model.setValueAt("Ocupado", 2, 3); // Miércoles 14:00-16:00 ocupado
            lblInformacionCurso.setText("<html><h2>Historia</h2><p>Curso sobre historia mundial y nacional.</p></html>");
        } else if ("Arte".equals(curso)) {
            model.setValueAt("Ocupado", 3, 4); // Jueves 16:00-18:00 ocupado
            lblInformacionCurso.setText("<html><h2>Arte</h2><p>Curso de pintura, escultura y diseño.</p></html>");
        } else if ("Programación".equals(curso)) {
            model.setValueAt("Ocupado", 4, 5); // Viernes 18:00-20:00 ocupado
            lblInformacionCurso.setText("<html><h2>Programación</h2><p>Curso sobre Java, Python y estructuras de datos.</p></html>");
        }
    }
}


