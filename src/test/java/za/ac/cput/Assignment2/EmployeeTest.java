package za.ac.cput.Assignment2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

class EmployeeTest {

    @Test
    void test(){
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
        employeeNum.put("Shasta", 1);
        //remove
        employeeNum.remove("Shasta");
        //find
        employeeNum.get("Shasta");
    }
}