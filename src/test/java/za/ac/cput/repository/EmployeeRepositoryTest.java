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
        Employee empCreated = repository.create(employee);
        assertEquals(employee.getEmpNumber(), empCreated.getEmpNumber());
        System.out.println("Create: " + empCreated);

    }

    @Test
    void b_read(){


    }

    @Test
    void c_update(){

    }

    @Test
    void e_delete(){

    }

    @Test
    void d_getAll(){

    }

}