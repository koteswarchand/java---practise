package  com.example.springbootdemo.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    
    String name;
    String empid;
    String dob;
    String role;
    public String getName() {
        return name;
    }
   
    public String getEmpid() {
        return empid;
    }
  
    public String getDob() {
        return dob;
    }
  
    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee [dob=" + dob + ", empid=" + empid + ", name=" + name + ", role=" + role + "]";
    }

    public Employee(String name, String empid, String dob, String role) {
        this.name = name;
        this.empid = empid;
        this.dob = dob;
        this.role = role;
    }
    
    
    

}
