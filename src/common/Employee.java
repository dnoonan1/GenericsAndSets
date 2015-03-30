package common;

import java.util.*;

public class Employee implements Comparable<Employee> {
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /*
     * The following methods - hashCode, equals, and toString (I also
     * implemented compareTo) are for Class 18, Lab Activity 1.
     */
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.ssn);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) { // false if obj is null
            Employee that = (Employee)obj;
            // Compare ssn's
            return this.ssn.equals(that.ssn);
        }
        return false;
    }
    
    @Override
    public int compareTo(Employee employee) {
        // Compare ssn's
        return ssn.compareTo(employee.ssn);
    }
    
    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + " SSN: " + ssn;
    }

}
