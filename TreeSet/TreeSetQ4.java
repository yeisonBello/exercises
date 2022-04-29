package Fileexercises;

import java.util.Iterator;
import java.util.TreeSet;

//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
public class TreeSetQ4 {
    public static void main(String[] args) {
        TreeSet<String> positions = new TreeSet<>();
        positions.add("one");
        positions.add("two");
        positions.add("three");

        System.out.println("before reverse"+positions);
        Iterator<String> it = positions.descendingIterator();
        System.out.println("after reverse");
        while(it.hasNext()){

            System.out.println(it.next());}





    }
}
