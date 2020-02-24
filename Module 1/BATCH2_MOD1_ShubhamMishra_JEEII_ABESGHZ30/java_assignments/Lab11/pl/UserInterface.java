package Lab11.pl;

import Lab11.bean.Employee;
import Lab11.service.EmployeeService;
import Lab11.service.Services;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
    EmployeeService obj = new Services();

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EmployeeId:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name");
        String name = sc.next();
        System.out.println("Enter Employee Salary:");
        float salary = sc.nextFloat();
        System.out.println("Enter Designation:");
        String designation = sc.next();
        Employee obj1 = new Employee(id, name, salary, designation);
        obj.addEmployee(obj1);
        String i=obj.scheme(salary,designation);
        System.out.println("Scheme for the employee is " + i);
        Set<Employee> set1 = obj.AllEmployee();
        display(set1);
    }

    void display(Collection<Employee> emp) {
        for (Employee e : emp) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        UserInterface ui = new UserInterface();
        ui.getInput();


    }

}
