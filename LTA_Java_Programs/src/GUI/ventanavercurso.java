package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ventanavercurso extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tblHorario;
    private JTable tblInformacionCurso;

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

        // Crear la tabla para mostrar la información del curso
        String[] columnNamesInfo = { "Paralelo", "Costo", "Cupos", "Docente", "Modalidad" };
        String[][] dataInfo = {
            { "", "", "", "", "" } // Fila inicial vacía
        };

        DefaultTableModel infoModel = new DefaultTableModel(dataInfo, columnNamesInfo) {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // La tabla no será editable
            }
        };

        tblInformacionCurso = new JTable(infoModel);
        tblInformacionCurso.setFont(new Font("SansSerif", Font.PLAIN, 14));
        tblInformacionCurso.setRowHeight(30);
        tblInformacionCurso.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 16));
        JScrollPane scrollInfo = new JScrollPane(tblInformacionCurso);
        infoPanel.add(scrollInfo, BorderLayout.CENTER);

        // Evento para el combo box
        comboBoxCursos.addActionListener(e -> {
            String cursoSeleccionado = (String) comboBoxCursos.getSelectedItem();
            actualizarHorarioYInformacion(cursoSeleccionado);
        });
    }

    private void actualizarHorarioYInformacion(String curso) {
        // Actualizar horario según el curso seleccionado
        DefaultTableModel model = (DefaultTableModel) tblHorario.getModel();
        DefaultTableModel infoModel = (DefaultTableModel) tblInformacionCurso.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 1; j < model.getColumnCount(); j++) {
                model.setValueAt("", i, j); // Limpia todas las celdas excepto las horas
            }
        }

        // Limpia la fila de la tabla de información
        for (int j = 0; j < infoModel.getColumnCount(); j++) {
            infoModel.setValueAt("", 0, j);
        }

        if ("Matemáticas".equals(curso)) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt("Ocupado", i, 1); // Lunes ocupado
            }
            infoModel.setValueAt("A", 0, 0);
            infoModel.setValueAt("$200", 0, 1);
            infoModel.setValueAt("25", 0, 2);
            infoModel.setValueAt("Dr. Pérez", 0, 3);
            infoModel.setValueAt("Presencial", 0, 4);
        } else if ("Ciencias".equals(curso)) {
            model.setValueAt("Ocupado", 1, 2); // Martes 10:00-12:00 ocupado
            infoModel.setValueAt("B", 0, 0);
            infoModel.setValueAt("$180", 0, 1);
            infoModel.setValueAt("20", 0, 2);
            infoModel.setValueAt("Mtra. López", 0, 3);
            infoModel.setValueAt("Virtual", 0, 4);
        } else if ("Historia".equals(curso)) {
            model.setValueAt("Ocupado", 2, 3); // Miércoles 14:00-16:00 ocupado
            infoModel.setValueAt("C", 0, 0);
            infoModel.setValueAt("$150", 0, 1);
            infoModel.setValueAt("30", 0, 2);
            infoModel.setValueAt("Dr. Ramírez", 0, 3);
            infoModel.setValueAt("Presencial", 0, 4);
        } else if ("Arte".equals(curso)) {
            model.setValueAt("Ocupado", 3, 4); // Jueves 16:00-18:00 ocupado
            infoModel.setValueAt("D", 0, 0);
            infoModel.setValueAt("$220", 0, 1);
            infoModel.setValueAt("15", 0, 2);
            infoModel.setValueAt("Mtro. Castillo", 0, 3);
            infoModel.setValueAt("Mixta", 0, 4);
        } else if ("Programación".equals(curso)) {
            model.setValueAt("Ocupado", 4, 5); // Viernes 18:00-20:00 ocupado
            infoModel.setValueAt("E", 0, 0);
            infoModel.setValueAt("$250", 0, 1);
            infoModel.setValueAt("20", 0, 2);
            infoModel.setValueAt("Ing. Gómez", 0, 3);
            infoModel.setValueAt("Virtual", 0, 4);
        }
    }
}



