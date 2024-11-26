package DBconnection;
import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class EmpleadoDB {
    private Connection conexion;

    public EmpleadoDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmpleado(Empleado data) {
        String sql = "INSERT INTO empleado(nombre, ap_paterno, ap_materno, fecha_nacimiento, ci, telefono, email, fecha_registro, sueldo, ubicacion, experiencia, detalles, tipo_empleo_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre());
            parameter.setString(2, data.getAp_Paterno());
            parameter.setString(3, data.getAp_Materno());
            parameter.setString(4, data.getFecha_Nacimiento());
            parameter.setString(5, data.getCi());
            parameter.setString(6, data.getTelefono());
            parameter.setString(7, data.getEmail());
            parameter.setString(8, data.getFecha_Registro());
            parameter.setDouble(9, data.getSueldo());
            parameter.setString(10, data.getUbicacion());
            parameter.setString(11, data.getExperiencia());
            parameter.setString(12, data.getDetalles());
            parameter.setInt(13, data.getTipo_Empleo_Id());
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editEmpleado(Empleado data, int id) {
        String sql = "UPDATE empleado SET nombre = ?, ap_paterno = ?, ap_materno = ?, fecha_nacimiento = ?, ci = ?, telefono = ?, email = ?, fecha_registro = ?, sueldo = ?, ubicacion = ?, experiencia = ?, detalles = ?, tipo_empleo_id = ? WHERE id_empleado = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setString(1, data.getNombre());
            parameter.setString(2, data.getAp_Paterno());
            parameter.setString(3, data.getAp_Materno());
            parameter.setString(4, data.getFecha_Nacimiento());
            parameter.setString(5, data.getCi());
            parameter.setString(6, data.getTelefono());
            parameter.setString(7, data.getEmail());
            parameter.setString(8, data.getFecha_Registro());
            parameter.setDouble(9, data.getSueldo());
            parameter.setString(10, data.getUbicacion());
            parameter.setString(11, data.getExperiencia());
            parameter.setString(12, data.getDetalles());
            parameter.setInt(13, data.getTipo_Empleo_Id());
            parameter.setInt(14, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmpleado(int id) {
        String sql = "DELETE FROM empleado WHERE id_empleado = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Empleado showEmpleado(int id) {
        String sql = "SELECT * FROM empleado WHERE id_empleado = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Empleado(
                    rs.getInt("id_empleado"),
                    rs.getString("nombre"),
                    rs.getString("ap_paterno"),
                    rs.getString("ap_materno"),
                    rs.getString("fecha_nacimiento"),
                    rs.getString("ci"),
                    rs.getString("telefono"),
                    rs.getString("email"),
                    rs.getString("fecha_registro"),
                    rs.getDouble("sueldo"),
                    rs.getString("ubicacion"),
                    rs.getString("experiencia"),
                    rs.getString("detalles"),
                    rs.getInt("tipo_empleo_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void showEmpleado() {
        String sql = "SELECT * FROM empleado";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                int id_empleado = rs.getInt("id_empleado");
                String nombre = rs.getString("nombre");
                String ap_paterno = rs.getString("ap_paterno");
                String ap_materno = rs.getString("ap_materno");
                String fecha_nacimiento = rs.getString("fecha_nacimiento");
                String ci = rs.getString("ci");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String fecha_registro = rs.getString("fecha_registro");
                double sueldo = rs.getDouble("sueldo");
                String ubicacion = rs.getString("ubicacion");
                String experiencia = rs.getString("experiencia");
                String detalles = rs.getString("detalles");
                int tipo_empleo_id = rs.getInt("tipo_empleo_id");

                System.out.println("-----------------------------------------------------------------");
                System.out.println("id_empleado: " + id_empleado);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido Paterno: " + ap_paterno);
                System.out.println("Apellido Materno: " + ap_materno);
                System.out.println("Fecha de Nacimiento: " + fecha_nacimiento);
                System.out.println("CI: " + ci);
                System.out.println("Telefono: " + telefono);
                System.out.println("Email: " + email);
                System.out.println("Fecha de Registro: " + fecha_registro);
                System.out.println("Sueldo: " + sueldo);
                System.out.println("Ubicacion: " + ubicacion);
                System.out.println("Experiencia: " + experiencia);
                System.out.println("Detalles: " + detalles);
                System.out.println("Tipo Empleo ID: " + tipo_empleo_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Empleado> getAllEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM empleado";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                empleados.add(new Empleado(
                    rs.getInt("id_empleado"),
                    rs.getString("nombre"),
                    rs.getString("ap_paterno"),
                    rs.getString("ap_materno"),
                    rs.getString("fecha_nacimiento"),
                    rs.getString("ci"),
                    rs.getString("telefono"),
                    rs.getString("email"),
                    rs.getString("fecha_registro"),
                    rs.getDouble("sueldo"),
                    rs.getString("ubicacion"),
                    rs.getString("experiencia"),
                    rs.getString("detalles"),
                    rs.getInt("tipo_empleo_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
