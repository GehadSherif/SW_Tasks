package DAO;

import Connection.MysqlConnection;
import Tables.HistoryOfPresentIllness;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistoryOfPresentIllnessDao {

    public ArrayList<HistoryOfPresentIllness> GetAllHistoryOfPresentIllnesss() {

        String query = "select *from historyofpresentillness";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<HistoryOfPresentIllness> historyOfPresentIllness = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                HistoryOfPresentIllness historyfpresentillness = new HistoryOfPresentIllness();
                historyfpresentillness.setVisitNo(rs.getString("VisitNo"));
                historyfpresentillness.setiDPatient(rs.getString("iDPatient"));
                historyfpresentillness.setDateOfVisit(rs.getDate("DateOfVisit"));
                historyfpresentillness.setComplain(rs.getString("Complain"));
                historyfpresentillness.setAnalysisOfComplain(rs.getString("AnalysisOfComplain"));
                historyfpresentillness.setDiagnosis(rs.getString("Diagnosis"));
                historyfpresentillness.setTreatment(rs.getString("Treatment"));
                historyfpresentillness.setDateOfNextExamination(rs.getDate("DateOfNextExmination"));
                historyfpresentillness.setRequiredInvestigations(rs.getString("RequiredInvestigations"));
                

                historyOfPresentIllness.add(historyfpresentillness);
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

        return historyOfPresentIllness;

    }

public int InsertHistoryOfPresentIllness() {
        int affected = 0;
        String query = "INSERT INTO historyofpresentillness VALUES ('3' ,'4' ,'2016-06-05' ,'headache' ,'mdwmqr' ,'ekwfjwek' ,'frmekf' ,'ultrasound' ,'2016-10-04')";
        Statement statement ;
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
    
    public int DeleteHistoryOfPresentIllness() {
        int affected = 0;
        String query = "DELETE FROM historyofpresentillness WHERE IDPatient=4";
        Statement statement ;
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
