package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.el.stream.Optional;

import com.maven.dto.Employee;
import com.maven.service.EmployeeServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateEmployeeServlet
 */
public class CreateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Employee employeeObj) throws ServletException, IOException {
		Integer empId = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		Double empSalary = Double.parseDouble(request.getParameter("empsal"));
		String empDept = request.getParameter("empDept");
		Employee employee = new Employee(empId, empName, empSalary, empDept);
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		java.util.Optional<Employee> addedEmployee = employeeService.addEmployee(employee);
		
		List<Employee> employees=employeeService .getEmployees();
		PrintWriter out= response.getWriter();
		if(addedEmployee.isPresent()) {
			out.print("<html>");
			out.print("<body bgColor='pink'>");
			out.print("<h1 style='color:green'>Employee added successfully..:)</h1></br>");
			
			out.print("<table border='1'>");
			out.print("<tr>");
			out.print("<th>Employee ID </th>");
			out.print("<th>Employee Name </th>");
			out.print("<th>Employee Salary </th>");
			out.print("<th>Employee Dept </th>");
			out.print("<th>update </th>");
			out.print("</table>");
			out.print("</tr>");
			
			for (Employee employeeObj1:employees);
			out.print("<tr>");
			out.print("<tr>"+employeeObj.getEmpId()+"</tr>");
			out.print("<tr>"+employeeObj.getEmpName()+"</tr>");
			out.print("<tr>"+employeeObj.getEmpSal()+"</tr>");
			out.print("<tr>"+employeeObj.getEmpDep()+"</tr>");
			out.print("<tr><button type='button' name='update' Employee'>UpdateEmployee</button></tr>");
			
		}
		out.print("<table");
			out.print("</body>");
			out.print("</html>");
			
		
		
	}
	}


