/* EmployeeFactory.java
   Employee Factory for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 05 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Employee;

public class EmployeeFactory {

    public static Employee createEmployee(int empId, String empFname, String empLname, String empAddress){
                    return new Employee.Builder().setEmpId(empId)
                            .setEmpFname(empFname)
                            .setEmpLname(empLname)
                            .setEmpAddress(empAddress)
                            .build();

    }
}
