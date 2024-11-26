package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class InscripcionDB {
    private Connection conexion;

    public InscripcionDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addInscripcion(Inscripcion inscripcion) {
        String sql = "INSERT INTO inscripcion(curso_id, horario_id, estudiante_id) VALUES(?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, inscripcion.getCurso_Id());
            parameter.setInt(2, inscripcion.getHorario_Id());
            parameter.setInt(3, inscripcion.getEstudiante_Id());
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editInscripcion(Inscripcion inscripcion, int id) {
        String sql = "UPDATE inscripcion SET curso_id = ?, horario_id = ?, estudiante_id = ? WHERE id_inscripcion = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, inscripcion.getCurso_Id());
            parameter.setInt(2, inscripcion.getHorario_Id());
            parameter.setInt(3, inscripcion.getEstudiante_Id());
            parameter.setInt(4, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteInscripcion(int id) {
        String sql = "DELETE FROM inscripcion WHERE id_inscripcion = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Inscripcion showInscripcion(int id) {
        String sql = "SELECT * FROM inscripcion WHERE id_inscripcion = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Inscripcion(
                    rs.getInt("id_inscripcion"),
                    rs.getInt("curso_id"),
                    rs.getInt("horario_id"),
                    rs.getInt("estudiante_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showInscripciones() {
        String sql = "SELECT * FROM inscripcion";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Id_Inscripcion: " + rs.getInt("id_inscripcion"));
                System.out.println("Curso_Id: " + rs.getInt("curso_id"));
                System.out.println("Horario_Id: " + rs.getInt("horario_id"));
                System.out.println("Estudiante_Id: " + rs.getInt("estudiante_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Inscripcion> getAllInscripciones() {
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                inscripciones.add(new Inscripcion(
                    rs.getInt("id_inscripcion"),
                    rs.getInt("curso_id"),
                    rs.getInt("horario_id"),
                    rs.getInt("estudiante_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inscripciones;
    }

    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM inscripcion";
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
