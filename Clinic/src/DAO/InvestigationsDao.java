package DAO;

import Connection.MysqlConnection;
import Tables.Investigations;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InvestigationsDao {

    public ArrayList<Investigations> GetAllInvestigationss() {

        String query = "select *from investigations";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<Investigations> investigations = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Investigations investigation = new Investigations();
                investigation.setNo(rs.getString("No"));
                investigation.setIDPatient(rs.getString("IDPatient"));
                investigation.setTestName(rs.getString("TestName"));
                investigation.setTestType(rs.getString("TestType"));
                investigation.setDate(rs.getDate("Date"));
                investigation.setReport(rs.getString("Report"));
                investigation.setAdditionalAttachment(rs.getBlob("AdditionalAttachment"));

                investigations.add(investigation);
            }

        } catch (Exception Ex) {
            System.out.print(Ex.getMessage());
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(InvestigationsDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return investigations;

    }
public int InsertInvestigations() {
        int affected = 0;
        String query = "INSERT INTO investigations VALUES ('3' ,'4' ,'cbc' ,'lab','2016-08-12','frfer','')";
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

    public int DeleteInvestigations() {
        int affected = 0;
        String query = "DELETE FROM investigations WHERE IDPatient=4";
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
