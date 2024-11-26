package DBconnection;
import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class HoraDB {
	private Connection conexion;
		
	public HoraDB() {
		try {
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	public void addHora(Hora data) {
		String sql="INSERT INTO Hora(dia,hora_inicio,hora_fin) VALUES(?,?,?)";

		try (PreparedStatement parameter=conexion.prepareStatement(sql)){
			parameter.setString(1, data.getDia());
			parameter.setString(2, data.getHora_entrada());
			parameter.setString(3, data.getHora_fin());			
			parameter.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editHora(Hora data, int id) {
        String sql = "UPDATE Hora SET dia = ?, hora_inicio = ?, hora_fin = ? WHERE id_hora = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
        	parameter.setString(1, data.getDia());
			parameter.setString(2, data.getHora_entrada());
			parameter.setString(3, data.getHora_fin());	
            parameter.setInt(4, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteHora(int id) {
        String sql = "DELETE FROM Hora WHERE id_hora = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Hora showHora(int id) {
        String sql = "SELECT * FROM Hora WHERE id_hora = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Hora(rs.getInt("id_hora"), rs.getString("dia"), rs.getString("hora_inicio"), rs.getString("hora_fin"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Hora showHora() {
        String sql = "SELECT * FROM Hora";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery(); 
            if (rs.next()) {
                int id_hora = rs.getInt("id_hora");
                String dia = rs.getString("dia");
                String inicio = rs.getString("hora_inicio");
                String fin = rs.getString("hora_fin");

                System.out.println("-----------------------------------------------------------------");
                System.out.println("id_hora: " + id_hora);
                System.out.println("Dia: " + dia);
                System.out.println("Hora: " + inicio + "-" + fin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM Hora;";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery(); 
            while (rs.next()) {
                return rs.getInt("row_count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public ArrayList<Hora> getAllHoras() {
        ArrayList<Hora> horas = new ArrayList<>();
        String sql = "SELECT * FROM Hora";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                horas.add(new Hora(
                    rs.getInt("id_hora"), 
                    rs.getString("dia"), 
                    rs.getString("hora_inicio"), 
                    rs.getString("hora_fin")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horas;
    }

}