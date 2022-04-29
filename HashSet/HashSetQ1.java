package Fileexercises;

import java.util.HashSet;
import java.util.Scanner;

//Write a Java program to append the specified element to the end of a hash set.
public class HashSetQ1 {
    public static void main(String[] args) {
        HashSet<String> numbers = new HashSet<>();
        numbers.add("one");
        numbers.add("two");


        System.out.println(numbers);

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Write down the next number to append to the list");
        String input = scanObj.nextLine();
        numbers.add(input);
        System.out.println(numbers);
// I tried to append more numbers but the news elements it does not goes to the end of the list,
// what I mean is the elements appended it does not follow the order !!!
    }


}
