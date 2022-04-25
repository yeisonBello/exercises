//2. Write a Java program to iterate through all elements in a linked list.
import java.util.Iterator;
import java.util.LinkedList;

public class exercise2 {
    public static void main(String[] args) {
        LinkedList<String> List2 = new LinkedList<String>();

        List2.add("one");
        List2.add("two");
        List2.add("three");
        List2.add("four");
        List2.add("five");

        Iterator<String> it = List2.iterator();//creating an iterator for my list

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
