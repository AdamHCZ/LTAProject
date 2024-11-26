package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class Tipo_empleoDB {
    private Connection conexion;

    public Tipo_empleoDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addTipoEmpleo(Tipo_empleo data) {
        String sql = "INSERT INTO tipo_empleo(nombre, nivel) VALUES(?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre());
            parameter.setInt(2, data.getNivel());
            parameter.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editTipoEmpleo(Tipo_empleo data, int id) {
        String sql = "UPDATE tipo_empleo SET nombre = ?, nivel = ? WHERE id_tipo_empleo = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre());
            parameter.setInt(2, data.getNivel());
            parameter.setInt(3, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTipoEmpleo(int id) {
        String sql = "DELETE FROM tipo_empleo WHERE id_tipo_empleo = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Tipo_empleo showTipoEmpleo(int id) {
        String sql = "SELECT * FROM tipo_empleo WHERE id_tipo_empleo = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Tipo_empleo(
                    rs.getInt("id_tipo_empleo"),
                    rs.getString("nombre"),
                    rs.getInt("nivel")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showTipoEmpleo() {
        String sql = "SELECT * FROM tipo_empleo";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                int id_tipo_empleo = rs.getInt("id_tipo_empleo");
                String nombre = rs.getString("nombre");
                int nivel = rs.getInt("nivel");

                System.out.println("-----------------------------------------------------------------");
                System.out.println("id_tipo_empleo: " + id_tipo_empleo);
                System.out.println("Nombre: " + nombre);
                System.out.println("Nivel: " + nivel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM tipo_empleo";
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

    public ArrayList<Tipo_empleo> getAllTipoEmpleos() {
        ArrayList<Tipo_empleo> tipos = new ArrayList<>();
        String sql = "SELECT * FROM tipo_empleo";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                tipos.add(new Tipo_empleo(
                    rs.getInt("id_tipo_empleo"),
                    rs.getString("nombre"),
                    rs.getInt("nivel")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipos;
    }
}
