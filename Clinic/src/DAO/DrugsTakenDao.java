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
        ArrayList<DrugsTaken> drugs = new ArrayList<DrugsTaken>();
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
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersonalDataDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return drugs;

    }

}
