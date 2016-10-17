package DAO;

import Connection.MysqlConnection;
import Tables.PastHistory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PastHistoryDao {

    public ArrayList<PastHistory> GetAllPastHistoryy() {

        String query = "select *from past_history";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<PastHistory> pasthistorys = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                PastHistory pasthistory = new PastHistory();
                pasthistory.setiDPatient(rs.getString("IDPatient"));
                pasthistory.setSurgeries(rs.getString("Surgeries"));
                pasthistory.setInjuriesOrAccidents(rs.getString("InjuriesOrAccidents"));
                pasthistory.setHcv(rs.getString("Hcv"));
                pasthistory.setHbv(rs.getString("Hbv"));
                pasthistory.setTb(rs.getString("Tb"));
                pasthistory.setBloodtransfusion(rs.getString("Bloodtransfusion"));
                pasthistory.setBilharziasis(rs.getString("Bilharziasis"));

                pasthistorys.add(pasthistory);
            }

        } catch (Exception Ex) {
            System.out.print(Ex.getMessage());
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonalDataDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return pasthistorys;

    }

    public int InsertPastHistory() {
        int affected = 0;
        String query = "INSERT INTO past_history VALUES ('6' ,'yes' ,'no' ,'yes' ,'yes' ,'no' ,'no' ,'no')";
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

    public int DeletePastHistory() {
        int affected = 0;
        String query = "DELETE FROM past_history WHERE IDPatient=6";
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
