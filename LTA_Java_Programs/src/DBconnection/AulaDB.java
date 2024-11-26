package DBconnection;
import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class AulaDB {
    private Connection conexion;

    public AulaDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addAula(Aula data) {
        String sql = "INSERT INTO aula(nombre_aula, capacidad, disponibilidad) VALUES(?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre_aula());
            parameter.setInt(2, data.getCapacidad());
            parameter.setBoolean(3, data.getDisponibilidad());
            parameter.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editAula(Aula data, int id) {
        String sql = "UPDATE aula SET nombre_aula = ?, capacidad = ?, disponibilidad = ? WHERE id_aula = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre_aula());
            parameter.setInt(2, data.getCapacidad());
            parameter.setBoolean(3, data.getDisponibilidad());
            parameter.setInt(4, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAula(int id) {
        String sql = "DELETE FROM aula WHERE id_aula = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Aula showAula(int id) {
        String sql = "SELECT * FROM aula WHERE id_aula = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Aula(rs.getInt("id_aula"), rs.getString("nombre_aula"), rs.getInt("capacidad"), rs.getBoolean("disponibilidad"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void showAula() {
        String sql = "SELECT * FROM aula";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                int id_aula = rs.getInt("id_aula");
                String nombre_aula = rs.getString("nombre_aula");
                int capacidad = rs.getInt("capacidad");
                boolean disponibilidad = rs.getBoolean("disponibilidad");

                System.out.println("-----------------------------------------------------------------");
                System.out.println("id_aula: " + id_aula);
                System.out.println("Nombre Aula: " + nombre_aula);
                System.out.println("Capacidad: " + capacidad);
                System.out.println("Disponibilidad: " + (disponibilidad ? "Disponible" : "No Disponible"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Aula> getAllAulas() {
        ArrayList<Aula> aulas = new ArrayList<>();
        String sql = "SELECT * FROM aula";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                aulas.add(new Aula(
                    rs.getInt("id_aula"),
                    rs.getString("nombre_aula"),
                    rs.getInt("capacidad"),
                    rs.getBoolean("disponibilidad")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aulas;
    }

    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM aula";
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
