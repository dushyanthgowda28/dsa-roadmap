package streams.filter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.getEmployees();
        Map<Integer, String> map = employeeList.stream()
                .collect(Collectors.toMap(
                        e -> e.getId(),
                        e -> e.getName(),
                        (oldData, newData) -> newData
                ));
        System.out.println(map);
    }
}
