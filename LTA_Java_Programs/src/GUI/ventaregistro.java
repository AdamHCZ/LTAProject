package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class ventaregistro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JList<String> list;
    private DefaultListModel<String> listModel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ventaregistro frame = new ventaregistro();
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
    public ventaregistro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 976, 569);
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
        volvermenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventanamenu menu = new ventanamenu();
                menu.setVisible(true);
                dispose();
            }
        });
        panelBotones.add(volvermenu);

        // Botón "Ver Estudiantes"
        JButton verestudiante = new JButton("VER ESTUDIANTES");
        verestudiante.setFont(new Font("Cambria", Font.BOLD, 14));
        verestudiante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarLista("Estudiantes");
            }
        });
        panelBotones.add(verestudiante);

        // Botón "Ver Trabajadores"
        JButton vertrabajadores = new JButton("VER TRABAJADORES");
        vertrabajadores.setFont(new Font("Cambria", Font.BOLD, 14));
        vertrabajadores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarLista("Trabajadores");
            }
        });
        panelBotones.add(vertrabajadores);

        // Botón "Ver Docentes"
        JButton verdocentes = new JButton("VER DOCENTES");
        verdocentes.setFont(new Font("Cambria", Font.BOLD, 14));
        verdocentes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarLista("Docentes");
            }
        });
        panelBotones.add(verdocentes);

        // Área de contenido para la lista
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setFont(new Font("Cambria", Font.PLAIN, 18));
        JScrollPane scrollPane = new JScrollPane(list);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Etiqueta para el título (opcional, en la parte superior)
        JLabel lblNewLabel = new JLabel("CUADRO DE REGISTROS");
        lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 30));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(lblNewLabel, BorderLayout.SOUTH); // Parte inferior
    }

    /**
     * Método para actualizar la lista según el botón seleccionado.
     */
    private void actualizarLista(String tipo) {
        listModel.clear(); // Limpia los elementos actuales
        switch (tipo) {
            case "Estudiantes":
                listModel.addElement("Estudiante 1");
                listModel.addElement("Estudiante 2");
                listModel.addElement("Estudiante 3");
                listModel.addElement("Estudiante 1");
                listModel.addElement("Estudiante 2");
                listModel.addElement("Estudiante 3");
                listModel.addElement("Estudiante 1");
                listModel.addElement("Estudiante 2");
                listModel.addElement("Estudiante 3");
                listModel.addElement("Estudiante 1");
                listModel.addElement("Estudiante 2");
                listModel.addElement("Estudiante 3");
                listModel.addElement("Estudiante 1");
                listModel.addElement("Estudiante 2");
                listModel.addElement("Estudiante 3");listModel.addElement("Estudiante 1");
                listModel.addElement("Estudiante 2");
                listModel.addElement("Estudiante 3");
                
                break;
            case "Trabajadores":
                listModel.addElement("Trabajador 1");
                listModel.addElement("Trabajador 2");
                listModel.addElement("Trabajador 3");
                break;
            case "Docentes":
                listModel.addElement("Docente 1");
                listModel.addElement("Docente 2");
                listModel.addElement("Docente 3");
                break;
            default:
                listModel.addElement("No hay datos disponibles");
        }
    }
}



