/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

/**
 *
 * @author instlogin
 */
public class Dog implements Comparable<Dog> {
    private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog that = (Dog)obj;
            return this.rabiesId == that.rabiesId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.rabiesId;
        return hash;
    }
    
    @Override
    public String toString() {
        return "Dog: " + name + " (" + rabiesId + ")";
    }

    @Override
    public int compareTo(Dog dog) {
        return Integer.compare(rabiesId, dog.rabiesId);
    }

}
