package LTA;

import java.sql.*;

public class HoraDB {
	private Connection conexion;
		
	public HoraDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monopoly", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	//Creación de una nueva propiedad
	public void agregarDia(Hora hr) {
		String sql="INSERT INTO propiedad(nombre,precio) VALUES(?,?)";
		try (PreparedStatement parametro=conexion.prepareStatement(sql)){
			parametro.setString(1, hr.getNombre());
			parametro.setInt(2, hr.getPrecio());
			parametro.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Edición de propiedad
	public void editarHora(Hora hr, int id) {
        String sql = "UPDATE propiedad SET nombre = ?, precio = ? WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setString(1, hr.getNombre());
            parametro.setInt(2, hr.getPrecio());
            parametro.setInt(3, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    // Eliminar una propiedad
    public void eliminarHora(int id) {
        String sql = "DELETE FROM propiedad WHERE id = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            parametro.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Obtener lista de propiedades
    public propiedad obtenerPropiedad(int id) {
        String sql = "SELECT * FROM propiedad WHERE id_propiedad = ?";
        try (PreparedStatement parametro = conexion.prepareStatement(sql)) {
            parametro.setInt(1, id);
            ResultSet rs = parametro.executeQuery();
            if (rs.next()) {
                return new propiedad(rs.getString("nombre"), rs.getInt("precio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
