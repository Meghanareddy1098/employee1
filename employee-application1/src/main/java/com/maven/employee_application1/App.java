package com.maven.employee_application1;

import java.util.List;
import java.util.Optional;

import com.maven.dto.Employee;
import com.maven.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
       Employee employee = new Employee(101, "maggi", 10000.0,"JAVA");
       Optional<Employee> addedEmployee=employeeService.addEmployee(employee);
       if(addedEmployee.isPresent()) {
    	   System.out.println("Employee added Success fully");
       }
       List<Employee> employees = employeeService.getEmployees();
       System.out.println(employee);
    }
}
