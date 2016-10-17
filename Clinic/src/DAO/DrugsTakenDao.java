package DAO;

import Connection.MysqlConnection;
import Tables.DrugsTaken;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DrugsTakenDao {

    public ArrayList<DrugsTaken> GetAllDrugs() {

        String query = "select *from drugs_taken";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<DrugsTaken> drugs = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                DrugsTaken drugstaken = new DrugsTaken();
                drugstaken.setIdPatient(rs.getInt("IdPatient"));
                // personaldata.setiD(rs.getInt("ID"));
                drugstaken.setNumber(rs.getInt("Number"));
                drugstaken.setMedicineName(rs.getString("MedicineName"));
                drugstaken.setDosage(rs.getInt("Dosage"));
                drugstaken.setStartDate(rs.getDate("StartDate"));
                drugstaken.setEndDate(rs.getDate("EndDate"));
                drugstaken.setStillTakingIt(rs.getString("StillTakingIt"));

                drugs.add(drugstaken);
            }
        } catch (Exception Ex) {
            System.out.print(Ex.getMessage());
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DrugsTakenDao.class.getName()).log(Level.WARNING, "trouble dtected", ex);
            }

        }

        return drugs;

    }

    public int InsertDrugsTaken() {
        int affected = 0;
        String query = "INSERT INTO drugs_taken VALUES (3 ,'4' ,'netlook' ,1,'2016-09-05','2016-10-05','yes')";
        Statement statement;
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();

        try {
            statement = connect.createStatement();
            affected = statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(PersonalDataDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return affected;

    }

    public int DeleteDrugsTaken() {
        int affected = 0;
        String query = "DELETE FROM drugs_taken WHERE Number=3";
        Statement statement;
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();

        try {
            statement = connect.createStatement();
            affected = statement.executeUpdate(query);

        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            Logger.getLogger(PersonalDataDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return affected;

    }

}
