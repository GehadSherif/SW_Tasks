package DAO;

import Connection.MysqlConnection;
import Tables.FamilyHistory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FamilyHistoryDao {

    public ArrayList<FamilyHistory> GetAllFamilyHistoryy() {

        String query = "select *from family_history";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<FamilyHistory> familyhistory = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                FamilyHistory familyhistoryy = new FamilyHistory();
                familyhistoryy.setiDPatient(rs.getString("IDPatient"));
                familyhistoryy.setType_illness(rs.getString("typeofillness"));
                familyhistoryy.setFamily_member(rs.getString("FamilyMemeberWhoHaveSameIllness"));
                familyhistoryy.setDescription(rs.getString("Description"));

                familyhistory.add(familyhistoryy);
            }

        } catch (Exception Ex) {
            System.out.print(Ex.getMessage());
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(FamilyHistoryDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return familyhistory;

    }
    
    
    public int InsertFamilyHistory() {
        int affected = 0;
        String query = "INSERT INTO family_history VALUES ('4' ,'headaache' ,'brother' ,'')";
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

    public int DeleteFamilyHistory() {
        int affected = 0;
        String query = "DELETE FROM family_history WHERE IDPatient=4";
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
