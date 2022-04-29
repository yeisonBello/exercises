package Fileexercises;

import java.util.Iterator;
import java.util.TreeSet;

//2. Write a Java program to iterate through all elements in a tree set.
public class TreeSetQ2 {
    public static void main(String[] args) {
        TreeSet<String> color = new TreeSet<>();
        color.add("blue");
        color.add("red");
        color.add("yellow");

 Iterator<String> it = color.iterator() ;
        while(it.hasNext()){
            System.out.println(it.next());

    }
}}

