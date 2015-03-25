package lists.with.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dnoonan1
 */
public class Demo1 {

    public static void main(String[] args) {
        
        List<String> beatles = new ArrayList<>();
        beatles.add("John");
        beatles.add("Paul");
        beatles.add("George");
        
        String favoriteBeatle = beatles.get(0);
        
        beatles.add(1, "Ringo");
        beatles.remove("George");
        
        for (String s : beatles) {
            System.out.println(s);
        }
        
    }
    
}
