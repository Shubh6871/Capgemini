package Lab11.bean;

public class Employee {
    private int id;
    private String name;
    private float salary;
    private String designation;
    String insuranceScheme;

    public Employee(int id, String name, float salary, String designation) {
        //super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public int hashCode() {
        return this.id=id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", insuranceScheme='" + insuranceScheme + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}
