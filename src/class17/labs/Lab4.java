package class17.labs;

import common.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Dan
 */
public class Lab4 {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Hood", "Robin", "111-11-1111"));
        employees.add(new Employee("John", "Little", "123-45-6789"));
        employees.add(new Employee("John", "Big", "123-45-6789"));
        employees.add(new Employee("Tuck", "Friar", "987-65-4321"));
        employees.add(new Employee("Tuck", "Friar", "987-65-4321"));
        employees.add(new Employee("Tuck", "Friar", "888-88-8888"));
        
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        
        Set noDupes = new HashSet(employees);
        employees = new ArrayList(noDupes);
        
        System.out.println("\nDuplicates removed");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        
    }
    
}
