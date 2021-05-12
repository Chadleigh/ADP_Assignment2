package za.ac.cput.Assignment2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

class EmployeeTest {

    @Test
    void test(){

        //add
        Collection<String> employeeNames = new ArrayList<>();
        employeeNames.add("Chad");
        employeeNames.add("Shasta");
        employeeNames.add("Layla");
        employeeNames.add("David");
        System.out.println(employeeNames);
        //remove
        employeeNames.removeIf(e -> e.startsWith("D"));
        //find
        Optional<String> firstElement = employeeNames.stream().findAny();

        //add
        List<String> employee = new ArrayList<>();
        employee.add("Chad");
        employee.add("Shasta");
        employee.add("Layla");
        employee.add("David");
        System.out.println(employee);
        //remove
        System.out.println(employee.remove(1));
        //find
        System.out.println(employee.get(0));

        //add
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Chad");
        uniqueNames.add("Shasta");
        uniqueNames.add("Layla");
        uniqueNames.add("David");
        System.out.println(uniqueNames);
        //remove
        System.out.println(uniqueNames.remove(2));
        System.out.println(uniqueNames);
        //find
        System.out.println(uniqueNames.stream().findAny());

        //add
        Map<String, Integer> employeeNum = new HashMap<>();
        employeeNum.put("Layla", 2);
        //remove
        employeeNum.remove("Layla");
        //find
        employeeNum.get("Layla");
    }
}