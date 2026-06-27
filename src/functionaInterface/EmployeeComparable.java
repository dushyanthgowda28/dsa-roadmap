package functionaInterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
    private int id;
    private String name;
    private double salary;

    public EmployeeComparable(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(EmployeeComparable o) {
//        if (this.salary > o.salary)
//            return -1;
//        if (this.salary < o.salary)
//            return 1;
//        else
//            return 0;
        return Double.compare(this.salary, o.salary);
    }

    public static void main(String[] args) {
        List<EmployeeComparable> employeeComparableList = Arrays.asList(
                new EmployeeComparable(1, "Abhiraj", 4000),
                new EmployeeComparable(3, "Nandan", 100),
                new EmployeeComparable(2, "Raman", 1000),
                new EmployeeComparable(3, "Vishnu", 500));

        Collections.sort(employeeComparableList);

        System.out.println(employeeComparableList);
    }
}
