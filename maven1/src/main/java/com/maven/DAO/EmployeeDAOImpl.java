package com.maven.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.maven.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	Map<Integer,Employee> employeeDB =new HashMap<>();



	
	public Optional<Employee> updateEmployee(Employee employee) {
		employeeDB.put(employee.getEmpId(), employee);
		return Optional.of(employeeDB.get(employee.getEmpId()));
		
	}


	
	public Optional<Employee> addEmployee(Employee employee) {
		if (employeeDB.containsKey(employee.getEmpId())) {
		employeeDB.replace(employee.getEmpId(), employee);
		return Optional.of(employee);
	} else {
		return Optional.of(null);
	}
	}

	
	
	
	public Optional<Employee> getEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}


	
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return new ArrayList<Employee>(employeeDB.values());
	}



	public Collection<? extends Employee> values() {
		// TODO Auto-generated method stub
		return null;
	}

}
