package za.ac.cput.service.entity.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Employee;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.repository.EmployeeRepository;
import za.ac.cput.service.entity.EmployeeService;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {


    private EmployeeService service;
    private String empNumber;
    private static EmployeeRepository repository = EmployeeRepository.getRepository();
    private static Employee employee = EmployeeFactory.createEmployee("Chadrack","Mbuyi","3 2nd Avenue, Rondebosch East");

    @Test
    void create() {
        Employee created = service.create(employee);
        assertEquals(employee.getEmpId(), created.getEmpId());
        System.out.println("Create: " + created);
    }

    @Test
    void read() {
        Employee read = this.service.read(this.employee.getEmpId());
        System.out.println(read);
        //assertAll(
                //() -> assertTrue(read.getEmpNumber().equals()),
                //() -> assertEquals(this.employee, read.getEmpNumber())
        //);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}