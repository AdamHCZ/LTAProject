package DBconnection;

import Code.*;
import java.sql.*;
import java.util.ArrayList;

public class Plan_curricularDB {
    private Connection conexion;

    public Plan_curricularDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/LTA", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPlanCurricular(Plan_curricular data) {
        String sql = "INSERT INTO plan_curricular(temario_id, malla_id) VALUES(?, ?)";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, data.getTemario_Id());
            parameter.setInt(2, data.getMalla_Id());
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editPlanCurricular(Plan_curricular data, int id) {
        String sql = "UPDATE plan_curricular SET temario_id = ?, malla_id = ? WHERE id_plan_curricular = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, data.getTemario_Id());
            parameter.setInt(2, data.getMalla_Id());
            parameter.setInt(3, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePlanCurricular(int id) {
        String sql = "DELETE FROM plan_curricular WHERE id_plan_curricular = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            parameter.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Plan_curricular showPlanCurricular(int id) {
        String sql = "SELECT * FROM plan_curricular WHERE id_plan_curricular = ?";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            parameter.setInt(1, id);
            ResultSet rs = parameter.executeQuery();
            if (rs.next()) {
                return new Plan_curricular(
                    rs.getInt("id_plan_curricular"),
                    rs.getInt("temario_id"),
                    rs.getInt("malla_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showPlanCurricular() {
        String sql = "SELECT * FROM plan_curricular";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                int id_plan_curricular = rs.getInt("id_plan_curricular");
                int temario_id = rs.getInt("temario_id");
                int malla_id = rs.getInt("malla_id");

                System.out.println("------------------------------------------------");
                System.out.println("id_plan_curricular: " + id_plan_curricular);
                System.out.println("Temario ID: " + temario_id);
                System.out.println("Malla ID: " + malla_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getIDs() {
        String sql = "SELECT COUNT(*) AS row_count FROM plan_curricular";
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

    public ArrayList<Plan_curricular> getAllPlanCurriculars() {
        ArrayList<Plan_curricular> plans = new ArrayList<>();
        String sql = "SELECT * FROM plan_curricular";
        try (PreparedStatement parameter = conexion.prepareStatement(sql)) {
            ResultSet rs = parameter.executeQuery();
            while (rs.next()) {
                plans.add(new Plan_curricular(
                    rs.getInt("id_plan_curricular"),
                    rs.getInt("temario_id"),
                    rs.getInt("malla_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plans;
    }
}
