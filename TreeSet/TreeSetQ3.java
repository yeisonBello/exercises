package Fileexercises;

import java.util.TreeSet;

//3. Write a Java program to add all the elements of a specified tree set to another tree set.
public class TreeSetQ3 {
    public static void main(String[] args) {
        TreeSet<String> numbers = new TreeSet<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");

        TreeSet<String> numbers2 = new TreeSet<>();
        numbers2.add("four");
        numbers2.add("five");
        numbers2.add("six");

        numbers.addAll(numbers2);
        System.out.println(numbers);


    }
}