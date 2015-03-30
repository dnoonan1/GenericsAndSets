package class17.labs;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dan
 */
public class Lab2 {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Hood", "Robin", "111-11-1111"));
        employees.add(new Employee("John", "Little", "123-45-6789"));
        employees.add(new Employee("Tuck", "Friar", "987-65-4321"));
        
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        
    }
    
}
