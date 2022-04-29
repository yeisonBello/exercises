package Fileexercises;

import java.util.HashSet;

//4. Write a Java program to empty an hash set.
public class HashSetQ4 {
    public static void main(String[] args) {
        HashSet<String> List4 = new HashSet<>();

        List4.add("one");
        List4.add("two");
        List4.add("three");
        List4.add("four");
        List4.add("five");
        System.out.println("before empty the hashSet");
        System.out.println(List4);
        List4.removeAll(List4);
        System.out.println("After empty the hashSet  ");
        System.out.println(List4);
    }
}
