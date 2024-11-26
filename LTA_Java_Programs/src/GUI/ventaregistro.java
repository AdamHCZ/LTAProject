package GUI;

import java.awt.Color;//
import java.awt.EventQueue;//
import java.awt.Font;//
import java.awt.event.ActionEvent;//
import java.awt.event.ActionListener;//

import javax.swing.DefaultListModel;
import javax.swing.JButton;//
import javax.swing.JFrame;//
import javax.swing.JLabel;//
import javax.swing.JList;
import javax.swing.JPanel;//
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;//

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
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Botón para volver al menú principal
        JButton volvermenu = new JButton("volver");
        volvermenu.setForeground(new Color(0, 0, 0));
        volvermenu.setBackground(new Color(192, 192, 192));
        volvermenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // vuelve a la ventanamenu
                ventanamenu menu = new ventanamenu();
                menu.setVisible(true);
                dispose();
            }
        });
        volvermenu.setBounds(10, 10, 99, 26);
        contentPane.add(volvermenu);

        // Etiqueta principal
        JLabel lblNewLabel = new JLabel("CUADRO DE REGISTROS");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 40));
        lblNewLabel.setBounds(248, 25, 446, 50);
        contentPane.add(lblNewLabel);

        // Botón "Ver Estudiantes"
        JButton verestudiante = new JButton("VER ESTUDIANTES");
        verestudiante.setBackground(new Color(255, 255, 255));
        verestudiante.setFont(new Font("Cambria", Font.BOLD, 20));
        verestudiante.setBounds(105, 100, 271, 50);
        verestudiante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarLista("Estudiantes");
            }
        });
        contentPane.add(verestudiante);

        // Botón "Ver Trabajadores"
        JButton vertrabajadores = new JButton("VER TRABAJADORES");
        vertrabajadores.setBackground(new Color(255, 255, 255));
        vertrabajadores.setFont(new Font("Cambria", Font.BOLD, 20));
        vertrabajadores.setBounds(556, 100, 271, 50);
        vertrabajadores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarLista("Trabajadores");
            }
        });
        contentPane.add(vertrabajadores);

        // Botón "Ver Docentes"
        JButton verdocentes = new JButton("VER DOCENTES");
        verdocentes.setBackground(new Color(255, 255, 255));
        verdocentes.setFont(new Font("Cambria", Font.BOLD, 20));
        verdocentes.setBounds(336, 180, 271, 50);
        verdocentes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarLista("Docentes");
            }
        });
        contentPane.add(verdocentes);

        // Modelo de lista y JList
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setFont(new Font("Cambria", Font.PLAIN, 18));
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(105, 260, 722, 250);
        contentPane.add(scrollPane);
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
                listModel.addElement("Estudiante 3");
                listModel.addElement("Estudiante 1");
                listModel.addElement("Estudiante 2");
                listModel.addElement("Estudiante 3");
                listModel.addElement("Estudiante 1");
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


