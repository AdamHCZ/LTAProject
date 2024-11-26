package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class TemarioDB {
    private Connection conexion;

    public TemarioDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addTemario(Temario data) {
        String sql = "INSERT INTO temario(area, tema, capitulos) VALUES(?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getArea());
            parameter.setString(2, data.getTema());
            parameter.setString(3, data.getCapitulos());
            parameter.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editTemario(Temario data, int id) {
        String sql = "UPDATE temario SET area = ?, tema = ?, capitulos = ? WHERE id_temario = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getArea());
            parameter.setString(2, data.getTema());
            parameter.setString(3, data.getCapitulos());
            parameter.setInt(4, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTemario(int id) {
        String sql = "DELETE FROM temario WHERE id_temario = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Temario showTemario(int id) {
        String sql = "SELECT * FROM temario WHERE id_temario = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Temario(
                    rs.getInt("id_temario"),
                    rs.getString("area"),
                    rs.getString("tema"),
                    rs.getString("capitulos")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showTemario() {
        String sql = "SELECT * FROM temario";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                int id_temario = rs.getInt("id_temario");
                String area = rs.getString("area");
                String tema = rs.getString("tema");
                String capitulos = rs.getString("capitulos");

                System.out.println("-----------------------------------------------------------------");
                System.out.println("ID Temario: " + id_temario);
                System.out.println("Área: " + area);
                System.out.println("Tema: " + tema);
                System.out.println("Capítulos: " + capitulos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM temario";
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

    public ArrayList<Temario> getAllTemarios() {
        ArrayList<Temario> temarios = new ArrayList<>();
        String sql = "SELECT * FROM temario";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                temarios.add(new Temario(
                    rs.getInt("id_temario"),
                    rs.getString("area"),
                    rs.getString("tema"),
                    rs.getString("capitulos")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return temarios;
    }
}
