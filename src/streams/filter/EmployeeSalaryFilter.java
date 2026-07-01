package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        List<Employee> result = employees.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .toList();

        System.out.println(result);

        List<String> employeeNameStartingWithA = employees.stream()
                .map(Employee::getName)
                .filter(name -> name.startsWith("A"))
                .toList();

        System.out.println(employeeNameStartingWithA);

        List<String> nameLengthGreaterThan5 = employees.stream()
                .map(Employee::getName)
                .filter(name -> name.length() > 5)
                .toList();

        System.out.println(nameLengthGreaterThan5);

        List<Employee> employeesFromItDepartment = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .toList();

        System.out.println(employeesFromItDepartment);

        List<Employee> employeesSalaryBetween50kTo75k = employees.stream()
                .filter(employee -> employee.getSalary() >= 50000 && employee.getSalary() <= 75000)
                .toList();

        System.out.println(employeesSalaryBetween50kTo75k);
    }
}

class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

class EmployeeData {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(101, "Amit", 45000, "IT"),
                new Employee(102, "Priya", 60000, "HR"),
                new Employee(103, "Rahul", 75000, "Finance"),
                new Employee(104, "Sneha", 50000, "IT"),
                new Employee(105, "Vikram", 90000, "Sales"),
                new Employee(106, "Neha", 55000, "HR"),
                new Employee(107, "Arjun", 48000, "Finance"),
                new Employee(108, "Pooja", 65000, "IT"),
                new Employee(109, "Karan", 70000, "Sales"),
                new Employee(110, "Anjali", 40000, "Marketing")
        );
    }
}
