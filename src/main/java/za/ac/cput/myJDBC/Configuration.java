package za.ac.cput.myJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Configuration {
    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection", "root", "Chadsmith2022");

            Statement statement = connection.createStatement();

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
