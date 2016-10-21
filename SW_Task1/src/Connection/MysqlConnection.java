package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {

    private static MysqlConnection instance;

    public MysqlConnection() {
    }

    public static MysqlConnection getInstance() {
        if (instance == null) {
            instance = new MysqlConnection();
        }
        return instance;
    }

    public Connection connection = null;

    public Connection getConnection() {

        System.out.println("Mysql Testing");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/online_store", "root", "");

        } catch (Exception ex) {

            System.out.println("Connection Error");
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                System.out.println("Connection Success");
            } else {
                System.out.println("Connection Failed");
            }

        }
        return connection;
    }

}
