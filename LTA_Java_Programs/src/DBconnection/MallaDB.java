package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class MallaDB {
    private Connection conexion;

    public MallaDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addMalla(Malla data) {
        String sql = "INSERT INTO malla(evaluaciones, fecha_recuperacion, fecha_consulta) VALUES(?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, data.getEvaluaciones());
            parameter.setString(2, data.getFecha_recuperacion());
            parameter.setString(3, data.getFecha_Consulta());
            parameter.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editMalla(Malla data, int id) {
        String sql = "UPDATE malla SET evaluaciones = ?, fecha_recuperacion = ?, fecha_consulta = ? WHERE id_malla = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, data.getEvaluaciones());
            parameter.setString(2, data.getFecha_recuperacion());
            parameter.setString(3, data.getFecha_Consulta());
            parameter.setInt(4, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteMalla(int id) {
        String sql = "DELETE FROM malla WHERE id_malla = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Malla showMalla(int id) {
        String sql = "SELECT * FROM malla WHERE id_malla = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Malla(
                    rs.getInt("id_malla"),
                    rs.getInt("evaluaciones"),
                    rs.getString("fecha_recuperacion"),
                    rs.getString("fecha_consulta")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showMalla() {
        String sql = "SELECT * FROM malla";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                int id_malla = rs.getInt("id_malla");
                int evaluaciones = rs.getInt("evaluaciones");
                String fecha_recuperacion = rs.getString("fecha_recuperacion");
                String fecha_consulta = rs.getString("fecha_consulta");

                System.out.println("-----------------------------------------------------------------");
                System.out.println("id_malla: " + id_malla);
                System.out.println("Evaluaciones: " + evaluaciones);
                System.out.println("Fecha Recuperación: " + fecha_recuperacion);
                System.out.println("Fecha Consulta: " + fecha_consulta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM malla";
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

    public ArrayList<Malla> getAllMallas() {
        ArrayList<Malla> mallas = new ArrayList<>();
        String sql = "SELECT * FROM malla";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                mallas.add(new Malla(
                    rs.getInt("id_malla"),
                    rs.getInt("evaluaciones"),
                    rs.getString("fecha_recuperacion"),
                    rs.getString("fecha_consulta")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mallas;
    }
}
