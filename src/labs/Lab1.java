package labs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dnoonan1
 */
public class Lab1 {

    public static void main(String[] args) {
        
        // Without generics
        List shapeList = new ArrayList();
        shapeList.add("sphere");
        shapeList.add("cylinder");
        shapeList.add("box");
        
        // Standard for loop
        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println((String)shapeList.get(i));
        }
        
        // Insert items
        shapeList.add(2, "torus");
        shapeList.add(0, "dodekahedron");
        
        // Enhanced for loop
        System.out.println("\nItems added:");
        for (Object o : shapeList) {
            System.out.println((String)o);
        }
        
        shapeList.remove("torus");
        shapeList.remove(0);
        
        System.out.println("\nItems removed:");
        for (Object o : shapeList) {
            System.out.println((String)o);
        }
        
    }
    
}
