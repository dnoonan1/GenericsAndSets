package class18.labs;

import common.Employee;
import common.EmployeeByLastName;
import java.util.*;

/**
 * Class 18, Lab Activity 2 (for Lab Activity 1, see common.Employee)
 * 
 * @author Dan
 */
public class Labs2to4 {

    public static void main(String[] args) {
        
        // Key will be ssn (String)
        Map<String, Employee> hashMap = new HashMap<>();
        Map<String, Employee> treeMap = new TreeMap<>();
        TreeSet<Employee> treeSet1 = new TreeSet<>();
        TreeSet<Employee> treeSet2;
        
        Employee robinHood, littleJohn, friarTuck, maidMarian, richardLionheart;
        
        robinHood = new Employee("Hood", "Robin", "111-11-1111");
        littleJohn = new Employee("John", "Little", "222-22-2222");
        friarTuck = new Employee("Tuck", "Friar", "222-22-2222");
        maidMarian = new Employee("Marian", "Maid", "333-33-3333");
        richardLionheart = new Employee("Lionheart", "Richard", "444-44-4444");
        
        // HashMap
        System.out.println("HashMap\n=======");
        
        hashMap.put(littleJohn.getSsn(), littleJohn);
        hashMap.put(friarTuck.getSsn(), friarTuck);
        hashMap.put(maidMarian.getSsn(), maidMarian);
        hashMap.put(richardLionheart.getSsn(), richardLionheart);
        hashMap.put(robinHood.getSsn(), robinHood);
     
        // Use get() to get items
        System.out.println(hashMap.get("111-11-1111"));
        System.out.println(hashMap.get("222-22-2222"));
        System.out.println(hashMap.get("333-33-3333"));
        System.out.println(hashMap.get("444-44-4444"));
        System.out.println(hashMap.get("555-55-5555")); // not in Map
        
        // Loop through keys
        System.out.println("\nLoop through keys:");
        for (String key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
        
        // Loop through values
        System.out.println("\nLoop through values:");
        for (Employee e : hashMap.values()) {
            System.out.println(e.getFullName());
        }
        
        // TreeMap
        System.out.println("\nTreeMap\n=======");
        
        treeMap.put(littleJohn.getSsn(), littleJohn);
        treeMap.put(friarTuck.getSsn(), friarTuck);
        treeMap.put(maidMarian.getSsn(), maidMarian);
        treeMap.put(richardLionheart.getSsn(), richardLionheart);
        treeMap.put(robinHood.getSsn(), robinHood);
        
        // Use get() to get items
        System.out.println(treeMap.get("111-11-1111"));
        System.out.println(treeMap.get("222-22-2222"));
        System.out.println(treeMap.get("333-33-3333"));
        System.out.println(treeMap.get("444-44-4444"));
        System.out.println(treeMap.get("555-55-5555")); // not in Map
        
        // Loop through keys
        System.out.println("\nLoop through keys:");
        for (String key : treeMap.keySet()) {
            System.out.println(treeMap.get(key));
        }
        
        // Loop through values
        System.out.println("\nLoop through values:");
        for (Employee e : treeMap.values()) {
            System.out.println(e.getFullName());
        }
        
        System.out.println("\nTreeSet\n=======");
        
        treeSet1.add(richardLionheart);
        treeSet1.add(robinHood);
        treeSet1.add(friarTuck);
        treeSet1.add(maidMarian);
        treeSet1.add(littleJohn);
        
        for (Employee e : treeSet1) {
            System.out.println(e);
        }
        
        System.out.println("\nOrdered by name:");
        
        treeSet2 = new TreeSet<Employee>(new EmployeeByLastName());
        treeSet2.addAll(treeSet1);
        
        for (Employee e : treeSet2) {
            System.out.println(e);
        }
        
    }
    
}
