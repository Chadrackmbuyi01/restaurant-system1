package za.ac.cput.repository;

import za.ac.cput.entity.Employee;

import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, Integer> {
    // The interface of the Employee Repo where I will define create, read, update and delete methods

    public Set<Employee> getAll();
}
