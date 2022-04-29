package Fileexercises;
//2. Write a Java program to iterate through all elements in a hash list.
import java.util.Iterator;
import  java.util.HashSet;


public class HashSetQ2 {
    public static void main(String[] args) {
        HashSet<String> List2 = new HashSet<>();

        List2.add("one");
        List2.add("two");
        List2.add("three");
        List2.add("four");
        List2.add("five");

        Iterator<String> it = List2.iterator();//creating an iterator for my list

        while(it.hasNext()){
            System.out.println(it.next());

}
    }}