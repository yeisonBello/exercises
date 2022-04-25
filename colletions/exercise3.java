
//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
//4. Write a Java program to iterate a linked list in reverse order.
//5. Write a Java program to insert the specified element at the specified position in the linked list.


import java.util.LinkedList;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        LinkedList<Integer> List3 = new LinkedList<>();

        List3.add(1);
        List3.add(2);
        List3.add(3);
        List3.add(4);
        List3.add(5);
        List3.add(6);
        List3.add(7);
        List3.add(8);
        List3.add(9);
        List3.add(10);


        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the number from where you want to start the interation : ");
        int Input = Integer.parseInt(scanObj.nextLine());
        int index = Input + 1 ;


        for (int i = index; i < List3.size()+1; i++) {
            System.out.println( i );


}}}
