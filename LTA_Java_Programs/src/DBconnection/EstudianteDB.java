package DBconnection;
import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class EstudianteDB {
    private Connection conexion;

    public EstudianteDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/lta", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEstudiante(Estudiante data) {
        String sql = "insert into estudiante(nombre, ap_paterno, ap_materno, fecha_nacimiento, ci, telefono, email, fecha_registro, edad, inscrito) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre());
            parameter.setString(2, data.getAp_Paterno());
            parameter.setString(3, data.getAp_Materno());
            parameter.setString(4, data.getFecha_Nacimiento());
            parameter.setString(5, data.getCi());
            parameter.setString(6, data.getTelefono());
            parameter.setString(7, data.getEmail());
            parameter.setString(8, data.getFecha_Registro());
            parameter.setInt(9, data.getEdad());
            parameter.setBoolean(10, data.getInscrito());
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editEstudiante(Estudiante data, int id) {
        String sql = "update estudiante set nombre = ?, ap_paterno = ?, ap_materno = ?, fecha_nacimiento = ?, ci = ?, telefono = ?, email = ?, fecha_registro = ?, edad = ?, inscrito = ? where id_estudiante = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre());
            parameter.setString(2, data.getAp_Paterno());
            parameter.setString(3, data.getAp_Materno());
            parameter.setString(4, data.getFecha_Nacimiento());
            parameter.setString(5, data.getCi());
            parameter.setString(6, data.getTelefono());
            parameter.setString(7, data.getEmail());
            parameter.setString(8, data.getFecha_Registro());
            parameter.setInt(9, data.getEdad());
            parameter.setBoolean(10, data.getInscrito());
            parameter.setInt(11, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEstudiante(int id) {
        String sql = "delete from estudiante where id_estudiante = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Estudiante showEstudiante(int id) {
        String sql = "select * from estudiante where id_estudiante = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Estudiante(
                    rs.getInt("id_estudiante"),
                    rs.getString("nombre"),
                    rs.getString("ap_paterno"),
                    rs.getString("ap_materno"),
                    rs.getString("fecha_nacimiento"),
                    rs.getString("ci"),
                    rs.getString("telefono"),
                    rs.getString("email"),
                    rs.getString("fecha_registro"),
                    rs.getInt("edad"),
                    rs.getBoolean("inscrito")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showEstudiantes() {
        String sql = "select * from estudiante";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                int idEstudiante = rs.getInt("id_estudiante");
                String nombre = rs.getString("nombre");
                String apPaterno = rs.getString("ap_paterno");
                String apMaterno = rs.getString("ap_materno");
                String fechaNacimiento = rs.getString("fecha_nacimiento");
                String ci = rs.getString("ci");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String fechaRegistro = rs.getString("fecha_registro");
                int edad = rs.getInt("edad");
                boolean inscrito = rs.getBoolean("inscrito");

                System.out.println("--------------------------------------------------------");
                System.out.println("id_estudiante: " + idEstudiante);
                System.out.println("Nombre: " + nombre);
                System.out.println("Ap Paterno: " + apPaterno);
                System.out.println("Ap Materno: " + apMaterno);
                System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
                System.out.println("Ci: " + ci);
                System.out.println("Telefono: " + telefono);
                System.out.println("Email: " + email);
                System.out.println("Fecha de Registro: " + fechaRegistro);
                System.out.println("Edad: " + edad);
                System.out.println("Inscrito: " + inscrito);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Estudiante> getAllEstudiantes() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        String sql = "select * from estudiante";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                estudiantes.add(new Estudiante(
                    rs.getInt("id_estudiante"),
                    rs.getString("nombre"),
                    rs.getString("ap_paterno"),
                    rs.getString("ap_materno"),
                    rs.getString("fecha_nacimiento"),
                    rs.getString("ci"),
                    rs.getString("telefono"),
                    rs.getString("email"),
                    rs.getString("fecha_registro"),
                    rs.getInt("edad"),
                    rs.getBoolean("inscrito")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
    
    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM estudiante";
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
