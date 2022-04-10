/* EmployeeFactoryTest.java
   Employee Test Factory for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 05 April 2022
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void test(){

        Employee employee = EmployeeFactory.createEmployee("Chadrack", "Kalala", "3 2nd Avenue, Rondebosch East");
        assertNotNull(employee);

    }

}