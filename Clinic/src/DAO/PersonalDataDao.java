package DAO;

import Connection.MysqlConnection;
import Tables.PersonalData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalDataDao {

    public ArrayList<PersonalData> GetAllPersonalDatas() {

        String query = "select *from personal_data";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<PersonalData> personaldatas = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                PersonalData personaldata = new PersonalData(rs.getInt("ID"));
                personaldata.setPatientName(rs.getString("PatientName"));
                personaldata.setBirthDate(rs.getDate("BirthDate"));
                personaldata.setPlaceOfBirth(rs.getString("PlaceOfBirth"));
                personaldata.setGender(rs.getString("Gender"));
                personaldata.setNationality(rs.getString("Nationality"));
                personaldata.setCurrentAddress(rs.getString("CurrentAddress"));
                personaldata.setMaritalStatus(rs.getString("MaritalStatus"));
                personaldata.setOffspring(rs.getInt("Offspring"));
                personaldata.setAgeOfYoungestOffspring(rs.getInt("AgeOfYoungestOffspring"));
                personaldata.setWorkNature(rs.getString("WorkNature"));
                personaldata.setPhoneNumber(rs.getString("PhoneNumber"));
                personaldata.setCityAddress(rs.getString("CityAddress"));
                personaldata.seteMail(rs.getString("EMail"));

                personaldatas.add(personaldata);
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

        return personaldatas;

    }

    public int InsertPersonalData() {
        //public int InsertPersonalData(PersonalData personaldata) {
        int affected = 0;
        //String query = "INSERT INTO personal_data VALUES ('" + personaldata.getiD() + "','" + personaldata.getPatientName() + "','" + personaldata.getBirthDate() + "','" + personaldata.getPlaceOfBirth() + "','" + personaldata.getGender() + "','" + personaldata.getNationality() + "','" + personaldata.getCurrentAddress() + "','" + personaldata.getCityAddress() + "','" + personaldata.getMaritalStatus() + "','" + personaldata.getOffspring() + "','" + personaldata.getAgeOfYoungestOffspring() + "','" + personaldata.getWorkNature() + "','" + personaldata.getPhoneNumber() + "','" + personaldata.geteMail() + "')";
        String query = "INSERT INTO personal_data VALUES (7 ,'ahmed' ,'1995-06-04' ,'cairo','male' ,'egyptian' , 222,'cairo',' single' ,1 , 15 ,'hard',' 0115751099', 'ahmed@yahoo.com')";
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

    public int DeletePersonalData() {
        int affected = 0;
        String query = "DELETE FROM personal_data WHERE iD=7";
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
