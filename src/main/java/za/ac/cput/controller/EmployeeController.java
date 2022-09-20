package za.ac.cput.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("restaurant/employee/")
public class EmployeeController {

    @PostMapping("create")
    public Employee create(Employee employee){
        System.out.println("Create");
        return null;

    }

    //public Employee read(String empNumber){

    //}

    //public Employee update(Employee employee){

    //}

    //public boolean delete(String s){

    //}

    //public List<Employee> getAll(){

    //}
}
