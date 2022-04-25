//4. Write a Java program to iterate a linked list in reverse order.


import java.util.LinkedList;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        LinkedList<Integer> List4 = new LinkedList<>();

        List4.add(1);
        List4.add(2);
        List4.add(3);
        List4.add(4);
        List4.add(5);
        List4.add(6);
        List4.add(7);
        List4.add(8);
        List4.add(9);
        List4.add(10);
        System.out.println( "before reversing: "+List4);

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter the number from where you want to start the interation : ");
        int Input = Integer.parseInt(scanObj.nextLine());
        int indexRe = Input ;
        System.out.println("after reversing using specific location");
        for (int x = indexRe; x > (List4.size() - List4.size()); x--) {
            System.out.print( List4.indexOf(x)+"--" );

}}}
