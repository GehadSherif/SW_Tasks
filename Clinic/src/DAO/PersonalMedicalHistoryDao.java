package DAO;

import Connection.MysqlConnection;
import Tables.PersonalMedicalHistory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalMedicalHistoryDao {

    public ArrayList<PersonalMedicalHistory> GetPersonalMedicalHistory() {
        String query = "select *from personal_medical_history;";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null ;
        ArrayList<PersonalMedicalHistory> personalmedicalhistoryy = new ArrayList<>();
        try {
            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                PersonalMedicalHistory personalmedicalhistory = new PersonalMedicalHistory();

                personalmedicalhistory.setiDPatient(rs.getInt("iDPatient"));
                personalmedicalhistory.setHeight(rs.getInt("height"));
                personalmedicalhistory.setWeight(rs.getInt("weight"));
                personalmedicalhistory.setAboBloodType(rs.getString("aboBloodType"));
                personalmedicalhistory.setRhBloodType(rs.getString("rhBloodType"));
                personalmedicalhistory.setHyperTension(rs.getString("Hypertension"));
                personalmedicalhistory.setdM(rs.getString("DM"));
                personalmedicalhistory.setAllergies(rs.getString("allergies"));
                personalmedicalhistory.setSmoking(rs.getString("Smoking"));
                personalmedicalhistory.setTypeOfSmoking(rs.getString("TypeOfSmoking"));
                personalmedicalhistory.setCigarettesDay(rs.getInt("cigarettesDay"));
                personalmedicalhistory.setYearsOfSmoking(rs.getInt("yearsOfSmoking"));
                personalmedicalhistory.setAlcohol(rs.getString("alcohol"));
                personalmedicalhistory.setCannabis(rs.getString("cannabis"));
                personalmedicalhistory.setNarcotic(rs.getString("narcotic"));
                personalmedicalhistory.setNarcoticsDrugs(rs.getString("narcoticsDrugs"));
                personalmedicalhistory.setStimulants(rs.getString("stimulants"));
                personalmedicalhistory.setStimulantsDrugs(rs.getString("stimulantsDrugs"));
                personalmedicalhistory.setAntiDepressants(rs.getString("AntiDepressants"));
                personalmedicalhistory.setAntiDepressantsDrugs(rs.getString("antiDepressantsDrugs"));
                personalmedicalhistory.setHallucinogens(rs.getString("hallucinogens"));
                personalmedicalhistory.setHallucinogensDrugs(rs.getString("hallucinogensDrugs"));
                personalmedicalhistoryy.add(personalmedicalhistory);
            }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonalMedicalHistoryDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return personalmedicalhistoryy;
    }
    
     public int InsertPersonalMedicalHistory() {
        int affected = 0;
        String query = "INSERT INTO personal_medical_history VALUES (4 ,160 ,65 ,'B','+' ,'No' , 'gtgvb','gvt','yes' ,'fgrgtr' , 2 , 2 ,'afre', 'refre','grgvtr' ,'rfrefer', 'referf','dfvdf','dfdfd','ereqf','ferreg','wqwdsx')";
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

    public int DeletePersonalMedicalHistory() {
        int affected = 0;
        String query = "DELETE FROM personal_medical_history WHERE iDPatient=4";
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
