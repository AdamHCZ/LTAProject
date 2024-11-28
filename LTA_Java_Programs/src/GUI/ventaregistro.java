package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ventaregistro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel tableModel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ventaregistro frame = new ventaregistro();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public ventaregistro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(10, 10));
        setContentPane(contentPane);

        // Panel superior para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(255, 255, 255));
        contentPane.add(panelBotones, BorderLayout.NORTH);

        // Botón para volver al menú principal
        JButton volvermenu = new JButton("volver");
        volvermenu.setBackground(new Color(192, 192, 192));
        volvermenu.setFont(new Font("Cambria", Font.PLAIN, 14));
        volvermenu.addActionListener(e -> {
            ventanamenu menu = new ventanamenu();
            menu.setVisible(true);
            dispose();
        });
        panelBotones.add(volvermenu);

        // Botón "Ver Estudiantes"
        JButton verestudiante = new JButton("VER ESTUDIANTES");
        verestudiante.setFont(new Font("Cambria", Font.BOLD, 14));
        verestudiante.addActionListener(e -> actualizarTabla("Estudiantes"));
        panelBotones.add(verestudiante);

        // Botón "Ver Trabajadores"
        JButton vertrabajadores = new JButton("VER TRABAJADORES");
        vertrabajadores.setFont(new Font("Cambria", Font.BOLD, 14));
        vertrabajadores.addActionListener(e -> actualizarTabla("Trabajadores"));
        panelBotones.add(vertrabajadores);

        // Botón "Ver Docentes"
        JButton verdocentes = new JButton("VER DOCENTES");
        verdocentes.setFont(new Font("Cambria", Font.BOLD, 14));
        verdocentes.addActionListener(e -> actualizarTabla("Docentes"));
        panelBotones.add(verdocentes);

        // Tabla para mostrar datos
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        table.setFont(new Font("Cambria", Font.PLAIN, 16));
        table.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Etiqueta para el título
        JLabel lblNewLabel = new JLabel("CUADRO DE REGISTROS");
        lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(lblNewLabel, BorderLayout.SOUTH); // Parte inferior
    }

    /**
     * Método para actualizar la tabla según el botón seleccionado.
     */
    private void actualizarTabla(String tipo) {
        tableModel.setRowCount(0); // Limpia las filas actuales
        tableModel.setColumnCount(0); // Limpia las columnas actuales

        switch (tipo) {
            case "Estudiantes":
                tableModel.setColumnIdentifiers(new String[]{
                        "Nombre", "Apellido Paterno", "Apellido Materno", 
                        "Fecha de Nacimiento", "Teléfono", "CI", "Edad", "Correo"
                });
                tableModel.addRow(new Object[]{"Juan", "Pérez", "Gómez", "01/01/2000", "123456789", "987654", 24, "juan@gmail.com"});
                tableModel.addRow(new Object[]{"Ana", "López", "Martínez", "15/05/2001", "987654321", "123456", 23, "ana@gmail.com"});
                break;
            case "Trabajadores":
                tableModel.setColumnIdentifiers(new String[]{
                        "Nombre", "Apellido Paterno", "Apellido Materno", 
                        "Fecha de Nacimiento", "Teléfono", "CI", "Tipo de Trabajo", "Sueldo", "Correo"
                });
                tableModel.addRow(new Object[]{"Carlos", "Ruiz", "Fernández", "10/03/1985", "555678123", "654321", "Mantenimiento", "1500 USD", "carlos.ruiz@empresa.com"});
                tableModel.addRow(new Object[]{"María", "Santos", "Paredes", "22/07/1990", "667788990", "112233", "Administración", "1800 USD", "maria.santos@empresa.com"});
                break;
            case "Docentes":
                tableModel.setColumnIdentifiers(new String[]{
                        "Nombre", "Apellido Paterno", "Apellido Materno", 
                        "Teléfono", "CI", "Sueldo", "Correo"
                });
                tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});
                tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});
                tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});
                tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});
                tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});
                tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});
                tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});tableModel.addRow(new Object[]{"Luis", "Hernández", "Rodríguez", "111222333", "998877", "2000 USD", "luis.hernandez@colegio.com"});
                tableModel.addRow(new Object[]{"Elena", "García", "Ramírez", "444555666", "776655", "2200 USD", "elena.garcia@colegio.com"});
                break;
            default:
                tableModel.setColumnIdentifiers(new String[]{"Mensaje"});
                tableModel.addRow(new Object[]{"No hay datos disponibles"});
        }
    }
}




