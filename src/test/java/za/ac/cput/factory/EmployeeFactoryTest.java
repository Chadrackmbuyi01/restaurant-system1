package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void test(){

        Employee employee = EmployeeFactory.createEmployee(103, "Chadrack", "Kalala", "3 2nd Avenue, Rondebosch East");
        assertNotNull(employee);

    }

}