package Dao;

import Connection.MysqlConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Tables.Product;

public class ProductDao {

    public ArrayList<Product> GetAllProducts() {

        String query = "SELECT *FROM product";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<Product> products = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Product product = new Product();
                product.setProductID(rs.getInt("ProductID"));
                product.setType(rs.getString("Type"));
                product.setManufacturer(rs.getString("Manufacturer"));
                product.setProductionDate(rs.getString("ProductionDate"));
                product.setExpiryDate(rs.getString("ExpiryDate"));

                products.add(product);
            }

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return products;

    }

    public int InsertProduct(Product product) {
        int affected = 0;
        String query = "INSERT INTO product VALUES ('" + product.getProductID() + "','" + product.getType() + "','" + product.getManufacturer() + "','" + product.getProductionDate() + "','" + product.getExpiryDate() + "')";
        Statement statement = null;
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();

        try {
            statement = connect.createStatement();
            affected = statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return affected;

    }

    public int DeleteProduct(Product product) {
        int affected = 0;
        String query = "Delete FROM product WHERE  ProductID = '" + product.getProductID() + "'";
        Statement statement = null;
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();

        try {
            statement = connect.createStatement();
            affected = statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return affected;

    }

    public int UpdateProduct(Product product, Product newproduct) {
        int affected = 0;
        String query = "Update product SET  ProductID = '" + newproduct.getProductID() + "',Type ='" + newproduct.getType() + "',Manufacturer ='" + newproduct.getManufacturer() + "', ProductionDate ='" + newproduct.getProductionDate() + "',ExpiryDate ='" + newproduct.getExpiryDate() + "' Where ProductID = '" + product.getProductID() + "' ";
        Statement statement = null;
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();

        try {
            statement = connect.createStatement();
            affected = statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return affected;

    }

    public ArrayList<Product> GetAllManufacturers(Product D) {

        String query = "SELECT * FROM product WHERE Manufacturer = '" + D.getManufacturer() + "'";
        MysqlConnection con = MysqlConnection.getInstance();
        Connection connect = con.getConnection();
        Statement statement = null;
        ArrayList<Product> products = new ArrayList<>();
        try {

            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Product product = new Product();
                product.setProductID(rs.getInt("ProductID"));
                product.setType(rs.getString("Type"));
                product.setManufacturer(rs.getString("Manufacturer"));
                product.setProductionDate(rs.getString("ProductionDate"));
                product.setExpiryDate(rs.getString("ExpiryDate"));

                products.add(product);

            }

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            try {
                connect.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return products;

    }

}
