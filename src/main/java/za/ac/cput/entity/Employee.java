/* Employee.java
   Entity for the Employee
   Author: Chadrack Mbuyi Kalala (219013012)
   Date: 29 March 2022
 */
package za.ac.cput.entity;

public class Employee {
    private int empId;
    private String empFname;
    private String empLname;
    private String empAddress;

    public Employee(){

    }

    // private constructor required
    private Employee(Builder builder){
        // private
        this.empId = builder.empId;
        this.empFname = builder.empFname;
        this.empLname = builder.empLname;
        this.empAddress = builder.empAddress;


    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFname() {
        return empFname;
    }

    public void setEmpFname(String empFname) {
        this.empFname = empFname;
    }

    public String getEmpLname() {
        return empLname;
    }

    public void setEmpLname(String empLname) {
        this.empLname = empLname;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empFname='" + empFname + '\'' +
                ", empLname='" + empLname + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }

    public static class Builder{

        private int empId;
        private String empFname;
        private String empLname;
        private String empAddress;

        public Builder setEmpId(int empId) {
            this.empId = empId;
            return this;
        }

        public Builder setEmpFname(String empFname) {
            this.empFname = empFname;
            return this;
        }

        public Builder setEmpLname(String empLname) {
            this.empLname = empLname;
            return this;
        }

        public Builder setEmpAddress(String empAddress) {
            this.empAddress = empAddress;
            return this;
        }

        public Builder copy(Employee employee){

            this.empId = employee.empId;
            this.empFname = employee.empFname;
            this.empLname = employee.empLname;
            this.empAddress = employee.empAddress;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

}
