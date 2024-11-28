package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class vetajahorario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable tblHorario;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                vetajahorario frame = new vetajahorario();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public vetajahorario() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1100, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Crear la tabla
        String[] columnNames = { "Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };
        String[][] data = {
            { "8:00-10:00", "Ocupado", "", "", "", "", "" },
            { "10:00-12:00", "Ocupado", "", "", "", "", "" },
            { "14:00-16:00", "Ocupado", "", "", "", "", "" },
            { "16:00-18:00", "Ocupado", "", "", "", "", "" },
            { "18:00-20:00", "Ocupado", "", "", "", "", "" },
            { "20:00-22:00", "Ocupado", "", "", "", "", "" },
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0; // La primera columna no es editable
            }
        };

        tblHorario = new JTable(model);
        tblHorario.setFont(new Font("SansSerif", Font.PLAIN, 14));
        tblHorario.setRowHeight(40);
        tblHorario.setBackground(Color.WHITE);
        tblHorario.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 16));
        tblHorario.getTableHeader().setBackground(new Color(192, 192, 192));
        tblHorario.setSelectionBackground(new Color(135, 206, 250));

        // Agregar evento para manejar selección y deselección
        tblHorario.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = tblHorario.getSelectedRow();
                int col = tblHorario.getSelectedColumn();
                if (col > 0) { // Evitar modificar la columna de horas
                    String value = (String) tblHorario.getValueAt(row, col);
                    if ("Ocupado".equals(value)) {
                        System.out.println("La celda está ocupada y no puede ser seleccionada.");
                    } else if ("Seleccionado".equals(value)) {
                        tblHorario.setValueAt("", row, col); // Deseleccionar
                    } else {
                        tblHorario.setValueAt("Seleccionado", row, col); // Seleccionar
                    }
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(tblHorario);
        scrollPane.setBounds(10, 10, 1060, 400);
        contentPane.add(scrollPane);

        // Botón "Volver"
        JButton volvercurso = new JButton("Volver");
        volvercurso.setBounds(10, 420, 120, 40);
        volvercurso.setForeground(Color.BLACK);
        volvercurso.setBackground(new Color(192, 192, 192));
        volvercurso.setFont(new Font("SansSerif", Font.BOLD, 14));
        volvercurso.addActionListener(e -> {
            ventanacrearcurso menu = new ventanacrearcurso();
            menu.setVisible(true);
            dispose();
        });
        contentPane.add(volvercurso);

        // Botón "Guardar"
        JButton guardarHorario = new JButton("Guardar");
        guardarHorario.setBounds(950, 420, 120, 40);
        guardarHorario.setForeground(Color.BLACK);
        guardarHorario.setBackground(new Color(192, 192, 192));
        guardarHorario.setFont(new Font("SansSerif", Font.BOLD, 14));
        guardarHorario.addActionListener(e -> {
            ventanacursorealizado nuevo = new ventanacursorealizado();
            nuevo.setVisible(true);
            dispose();
        });
        contentPane.add(guardarHorario);
    }
}


