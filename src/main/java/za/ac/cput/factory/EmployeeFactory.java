/* EmployeeFactory.java
   Employee Factory for Restaurant management system
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 05 April 2022
 */
package za.ac.cput.factory;

import za.ac.cput.entity.Employee;
import za.ac.cput.util.Helper;
import za.ac.cput.util.StringHelper;

public class EmployeeFactory {

    public static Employee createEmployee(String empFname, String empLname, String empAddress){
                    String employeeId = StringHelper.generateId();
                    Employee employee = new Employee.Builder().setEmpNumber(employeeId)
                            .setEmpFname(empFname)
                            .setEmpLname(empLname)
                            .setEmpAddress(empAddress)
                            .build();
                    return employee;

    }
}
