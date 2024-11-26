package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class HorarioDB {
    private Connection conexion;

    public HorarioDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to add a Horario
    public void addHorario(Horario horario) {
        String sql = "INSERT INTO horario(hora_id, aula_id, curso_id) VALUES(?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, horario.getHora_id());
            parameter.setInt(2, horario.getAula_id());
            parameter.setInt(3, horario.getCurso_id());
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to edit an existing Horario
    public void editHorario(Horario horario, int id) {
        String sql = "UPDATE horario SET hora_id = ?, aula_id = ?, curso_id = ? WHERE id_horario = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, horario.getHora_id());
            parameter.setInt(2, horario.getAula_id());
            parameter.setInt(3, horario.getCurso_id());
            parameter.setInt(4, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete a Horario by ID
    public void deleteHorario(int id) {
        String sql = "DELETE FROM horario WHERE id_horario = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve a Horario by ID
    public Horario showHorario(int id) {
        String sql = "SELECT * FROM horario WHERE id_horario = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Horario(
                    rs.getInt("id_horario"),
                    rs.getInt("hora_id"),
                    rs.getInt("aula_id"),
                    rs.getInt("curso_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Method to retrieve and print all Horarios
    public void showHorarios() {
        String sql = "SELECT * FROM horario";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Id_horario: " + rs.getInt("id_horario"));
                System.out.println("Hora_id: " + rs.getInt("hora_id"));
                System.out.println("Aula_id: " + rs.getInt("aula_id"));
                System.out.println("Curso_id: " + rs.getInt("curso_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve all Horarios as a list
    public ArrayList<Horario> getAllHorarios() {
        ArrayList<Horario> horarios = new ArrayList<>();
        String sql = "SELECT * FROM horario";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                horarios.add(new Horario(
                    rs.getInt("id_horario"),
                    rs.getInt("hora_id"),
                    rs.getInt("aula_id"),
                    rs.getInt("curso_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horarios;
    }

    // Method to count total Horarios
    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM horario";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return rs.getInt("row_count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
