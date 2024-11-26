package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class FacturaDB {
    private Connection conexion;

    public FacturaDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to add a Factura
    public void addFactura(Factura factura) {
        String sql = "INSERT INTO factura(nombre, ci, inscripcion_id) VALUES(?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, factura.getNombre());
            parameter.setString(2, factura.getCi());
            parameter.setInt(3, factura.getInscripcion_Id());
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to edit a Factura
    public void editFactura(Factura factura, int id) {
        String sql = "UPDATE factura SET nombre = ?, ci = ?, inscripcion_id = ? WHERE id_factura = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, factura.getNombre());
            parameter.setString(2, factura.getCi());
            parameter.setInt(3, factura.getInscripcion_Id());
            parameter.setInt(4, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete a Factura
    public void deleteFactura(int id) {
        String sql = "DELETE FROM factura WHERE id_factura = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve a Factura by ID
    public Factura showFactura(int id) {
        String sql = "SELECT * FROM factura WHERE id_factura = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Factura(
                    rs.getInt("id_factura"),
                    rs.getString("nombre"),
                    rs.getString("ci"),
                    rs.getInt("inscripcion_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Method to retrieve and print all Facturas
    public void showFacturas() {
        String sql = "SELECT * FROM factura";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Id_Factura: " + rs.getInt("id_factura"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("CI: " + rs.getString("ci"));
                System.out.println("Inscripcion_Id: " + rs.getInt("inscripcion_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve all Facturas as a list
    public ArrayList<Factura> getAllFacturas() {
        ArrayList<Factura> facturas = new ArrayList<>();
        String sql = "SELECT * FROM factura";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                facturas.add(new Factura(
                    rs.getInt("id_factura"),
                    rs.getString("nombre"),
                    rs.getString("ci"),
                    rs.getInt("inscripcion_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facturas;
    }

    // Method to count total Facturas
    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM factura";
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
