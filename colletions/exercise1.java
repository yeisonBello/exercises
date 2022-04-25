
//1. Write a Java program to append the specified element to the end of a linked list.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Write down 3 elemets that would you like to append to the list");
        while(list.add( scanObj.nextLine())&& list.size()<3 ){
         ;} ;
            System.out.println(list);

    }

}
