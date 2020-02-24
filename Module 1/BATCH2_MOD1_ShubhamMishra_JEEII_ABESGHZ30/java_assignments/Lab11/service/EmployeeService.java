package Lab11.service;

import java.util.Set;

import Lab11.bean.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee e);
	Set<Employee> AllEmployee();
	String scheme(float salary,String designation);
	

}
