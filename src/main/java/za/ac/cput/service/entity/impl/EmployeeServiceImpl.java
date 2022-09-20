/* EmployeeServiceImpl.java
   Employee Service Impl class for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 25 August 2022
 */
package za.ac.cput.service.entity.impl;

import za.ac.cput.entity.Employee;
import za.ac.cput.repository.EmployeeRepository;
import za.ac.cput.service.entity.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    private static EmployeeService SERVICE;

    public EmployeeServiceImpl(){
        this.repository = EmployeeRepository.getRepository();
    }
    public static EmployeeService getSERVICE(){
        if (SERVICE == null)
            SERVICE = new EmployeeServiceImpl();
        return SERVICE;
    }
    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee read(String empNumber) {
        return this.repository.read(empNumber);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) this.repository.getAll();
    }
}
