package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class CursoDB {
    private Connection conexion;

    public CursoDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCurso(Curso curso) {
        String sql = "INSERT INTO curso(paralelo, costo, formato, cupos, gestion, docente_id, duracion, plan_curricular_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, curso.getParalelo());
            parameter.setDouble(2, curso.getCosto());
            parameter.setString(3, curso.getFormato());
            parameter.setInt(4, curso.getCupos());
            parameter.setString(5, curso.getGestion());
            parameter.setInt(6, curso.getDocente_id());
            parameter.setInt(7, curso.getDuracion());
            parameter.setInt(8, curso.getPlan_curricular_id());
            parameter.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editCurso(Curso curso, int id) {
        String sql = "UPDATE curso SET paralelo = ?, costo = ?, formato = ?, cupos = ?, gestion = ?, docente_id = ?, duracion = ?, plan_curricular_id = ? WHERE id_curso = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, curso.getParalelo());
            parameter.setDouble(2, curso.getCosto());
            parameter.setString(3, curso.getFormato());
            parameter.setInt(4, curso.getCupos());
            parameter.setString(5, curso.getGestion());
            parameter.setInt(6, curso.getDocente_id());
            parameter.setInt(7, curso.getDuracion());
            parameter.setInt(8, curso.getPlan_curricular_id());
            parameter.setInt(9, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCurso(int id) {
        String sql = "DELETE FROM curso WHERE id_curso = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Curso showCurso(int id) {
        String sql = "SELECT * FROM curso WHERE id_curso = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Curso(
                    rs.getInt("id_curso"),
                    rs.getString("paralelo"),
                    rs.getDouble("costo"),
                    rs.getString("formato"),
                    rs.getInt("cupos"),
                    rs.getString("gestion"),
                    rs.getInt("docente_id"),
                    rs.getInt("duracion"),
                    rs.getInt("plan_curricular_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showCursos() {
        String sql = "SELECT * FROM curso";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                System.out.println("----------------------------------------------------");
                System.out.println("ID Curso: " + rs.getInt("id_curso"));
                System.out.println("Paralelo: " + rs.getString("paralelo"));
                System.out.println("Costo: " + rs.getDouble("costo"));
                System.out.println("Formato: " + rs.getString("formato"));
                System.out.println("Cupos: " + rs.getInt("cupos"));
                System.out.println("Gestion: " + rs.getString("gestion"));
                System.out.println("Docente ID: " + rs.getInt("docente_id"));
                System.out.println("Duracion: " + rs.getInt("duracion"));
                System.out.println("Plan Curricular ID: " + rs.getInt("plan_curricular_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM curso";
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

    public ArrayList<Curso> getAllCursos() {
        ArrayList<Curso> cursos = new ArrayList<>();
        String sql = "SELECT * FROM curso";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                cursos.add(new Curso(
                    rs.getInt("id_curso"),
                    rs.getString("paralelo"),
                    rs.getDouble("costo"),
                    rs.getString("formato"),
                    rs.getInt("cupos"),
                    rs.getString("gestion"),
                    rs.getInt("docente_id"),
                    rs.getInt("duracion"),
                    rs.getInt("plan_curricular_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursos;
    }
}
