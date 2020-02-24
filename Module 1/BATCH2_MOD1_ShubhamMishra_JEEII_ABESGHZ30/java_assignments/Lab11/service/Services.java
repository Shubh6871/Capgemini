package Lab11.service;

import Lab11.bean.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Services implements EmployeeService {

    List<Employee> list = new ArrayList<Employee>();

    @Override
    public void addEmployee(Employee e) {
        list.add(e);
    }

    @Override
    public Set<Employee> AllEmployee() {
        Set<Employee> employeeDetail = new HashSet<>(list);
        return employeeDetail;
    }

    @Override
    public String scheme(float salary, String designation) {
        if (((salary > 5000) && (salary < 20000)) && (designation.equals("System Associate"))) {
            return "Scheme C";
        } else if (((salary >= 20000) && (salary < 40000)) && (designation.equals("Programmer"))) {
            return "Scheme B";
        } else if ((salary >= 40000) && (designation.equals("Manager"))) {
            return "Scheme A";
        } else {
            return "No Scheme";
        }

    }


}
