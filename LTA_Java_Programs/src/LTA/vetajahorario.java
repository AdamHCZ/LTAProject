package LTA;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        setBounds(100, 100, 973, 567);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Crear la tabla
        String[] columnNames = { "Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" };
        String[][] data = {
            { "8:00-10:00", "", "", "", "", "" },
            { "10:00-12:00", "", "", "", "", "" },
            { "14:00-16:00", "", "", "", "", "" },
            { "16:00-18:00", "", "", "", "", "" },
            { "18:00-20:00", "", "", "", "", "" },
            { "20:00-22:00", "", "", "", "", "" },
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

        // Agregar evento para cambiar color de las celdas seleccionadas
        tblHorario.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = tblHorario.getSelectedRow();
                int col = tblHorario.getSelectedColumn();
                if (col > 0) { // Asegurarse de no incluir la columna de horas
                    tblHorario.setValueAt("Seleccionado", row, col);
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(tblHorario);
        scrollPane.setBounds(10, 10, 935, 400);
        contentPane.add(scrollPane);

        // Botón "Volver"
        JButton volvercurso = new JButton("Volver");
        volvercurso.setBounds(10, 420, 120, 40);
        volvercurso.setForeground(Color.BLACK);
        volvercurso.setBackground(new Color(192, 192, 192));
        volvercurso.setFont(new Font("SansSerif", Font.BOLD, 14));
        volvercurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Vuelve a la ventana anterior
                ventanacrearcurso menu = new ventanacrearcurso();
                menu.setVisible(true);
                dispose();
            }
        });
        contentPane.add(volvercurso);

        // Botón "Guardar"
        JButton guardarHorario = new JButton("Guardar");
        guardarHorario.setBounds(820, 420, 120, 40);
        guardarHorario.setForeground(Color.BLACK);
        guardarHorario.setBackground(new Color(192, 192, 192));
        guardarHorario.setFont(new Font("SansSerif", Font.BOLD, 14));
        guardarHorario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ventanacursorealizado nuevo = new ventanacursorealizado();
                nuevo.setVisible(true);
                dispose();
            }
        });
        contentPane.add(guardarHorario);
    }
}

