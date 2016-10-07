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
        ArrayList<PersonalData> personaldatas = new ArrayList<PersonalData>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                PersonalData personaldata = new PersonalData(rs.getInt("ID"));
                // personaldata.setiD(rs.getInt("ID"));
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

    public int InsertPersonalData(PersonalData personaldata) {
        int affected = 0;
        String query = "INSERT INTO personal_data VALUES ('" + personaldata.getiD() + "','" + personaldata.getPatientName() + "','" + personaldata.getBirthDate() + "','" + personaldata.getPlaceOfBirth() + "','" + personaldata.getGender() + "','" + personaldata.getNationality() + "','" + personaldata.getCurrentAddress() + "','" + personaldata.getCityAddress() + "','" + personaldata.getMaritalStatus() + "','" + personaldata.getOffspring() + "','" + personaldata.getAgeOfYoungestOffspring() + "','" + personaldata.getWorkNature() + "','" + personaldata.getPhoneNumber() + "','" + personaldata.geteMail() + "')";
        //String query = "INSERT INTO personal_data VALUES (3 ,'ahmed' ,'june,5,1994' ,'cairo','male' ,'egyptian' , 212 , ,' single' ,1 , 15 ,' 0115751099' , 'ahmed@yahoo.com')";
        Statement statement = null;
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

    ////////////////
//    public void delete(int ID) {
//
//        MysqlConnection con = MysqlConnection.getInstance();
//        Connection connect = con.getConnection();
//        PreparedStatement statement = null;
//
//        try {
//            String query = "DELETE FROM personal_data WHERE ID=1 ";
//
//            statement = connect.prepareStatement(query);
//            statement.setInt(1, ID);
//            statement.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Patient Deleted!");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "There is no such ID!");
//        }
//    }
}
