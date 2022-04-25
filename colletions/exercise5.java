import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
//5. Write a Java program to insert the specified element
       // at the specified position in the linked list.
public class exercise5 {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("one");
        names.add("two");
        names.add("four");
        names.add("five");


        System.out.println(names);
        System.out.println("--------------");
        System.out.println(" complete the missing number ");


        Scanner obj = new Scanner(System.in);
        names.add(2, obj.nextLine());
        System.out.println(names);






    }
}