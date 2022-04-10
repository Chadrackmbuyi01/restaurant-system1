/* EmployeeRepositoryTest.java
   Employee Repository Test class for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 08 April 2022
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeRepositoryTest {

    private static EmployeeRepository repository = EmployeeRepository.getRepository();
    private static Employee employee = EmployeeFactory.createEmployee("Chadrack","Mbuyi","3 2nd Avenue, Rondebosch East");

    @Test
    void a_create(){
        Employee created = repository.create(employee);
        assertEquals(employee.getEmpNumber(), created.getEmpNumber());
        System.out.println("Create: " + created);

    }

    @Test
    void b_read(){
        Employee read = repository.read(employee.getEmpNumber());
        assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void c_update(){
        Employee updated = new Employee.Builder().copy(employee).setEmpFname("Arthur")
                .setEmpLname("Mlambo")
                .setEmpAddress("227 Main Road, Wynberg")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete(){
        boolean success = repository.delete(employee.getEmpNumber());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll(){
        System.out.println("Show all: ");
        System.out.println(repository.getAll());

    }

}