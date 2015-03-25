package labs;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dan
 */
public class Lab3 {
 
    public static void main(String[] args) {
        
        List myList = new ArrayList();
        myList.add(new Employee("Hood", "Robin", "111-11-1111"));
        myList.add(new Employee("John", "Little", "123-45-6789"));
        myList.add(new Employee("Tuck", "Friar", "987-65-4321"));
        myList.add(new Dog("Rosie", 0));
        myList.add(new Dog("Ayda", 1));
        
        // Bad
//        for (Object o : myList) {
//            if (o instanceof Employee) {
//                Employee e = (Employee)o;
//                System.out.println(e.getFirstName() + " " + e.getLastName());
//            } else if (o instanceof Dog) {
//                Dog d = (Dog)o;
//                System.out.println(d.getName());
//            }
//        }
        
        // Good
        for (Object o : myList) {
            System.out.println(o.toString());
        }
        
    }
    
}
