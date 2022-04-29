package Fileexercises;

import java.util.TreeSet;

//5. Write a Java program to get the first and last elements in a tree set
public class TreeSetQ5 {
    public static void main(String[] args) {
        TreeSet<String> positions = new TreeSet<>();
        positions.add("1");
        positions.add("2");
        positions.add("3");

        System.out.println("   "+"TreeSet"+"  ");
        System.out.println("=="+positions+"==");



        System.out.println("--------------");
        String x = positions.first();
        String y = positions.last();
        System.out.println("fist element:" + x);
        System.out.println("last element:" + y);
        System.out.println("--------------");
}}