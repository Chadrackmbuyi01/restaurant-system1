package za.ac.cput.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Config_Database {

    private static void config(){

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection", "root", "Chadsmith2022");

            Statement statement = connection.createStatement();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
