package Fileexercises;

import java.util.HashSet;
//3. Write a Java program to get the number of elements in a hash set.
public class HashSetQ3 {
    public static void main(String[] args) {
        HashSet<String> List3 = new HashSet<>();

        List3.add("one");
        List3.add("two");
        List3.add("three");
        List3.add("four");
        List3.add("five");
        System.out.println("Original Hash Set: " + List3);
        System.out.println("Size of the Hash Set: " + List3.size());

    }
}
