/* EmployeeFactoryTest.java
   Employee Test Factory for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 05 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void test(){

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-connection", "root", "Chadsmith2022");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("empId"));

            }

        } catch (Exception e){
            e.printStackTrace();
        }

        //Employee employee = EmployeeFactory.createEmployee("Chadrack", "Kalala", "3 2nd Avenue, Rondebosch East");
        //assertNotNull(employee);
        //System.out.println(employee);

    }

}