package common;

import java.util.Comparator;

/**
 *
 * @author Dan
 */
public class EmployeeByName implements Comparator<Employee> {

    private static final int EQUAL = 0;
    
    @Override
    public int compare(Employee e1, Employee e2) {
        
        int comparison = e1.getLastName().compareTo(e2.getLastName());
        if (comparison == EQUAL) {
            return e1.getFirstName().compareTo(e2.getFirstName());
        }
        return EQUAL;
        
        /*
         * Or could simply use:
        
         *      return e1.getFullName().compareTo(e2.getFullName());
        
         * because I added added the method getFullName to Employee.
         */
    }
    
}
