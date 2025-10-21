import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistOps {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        //insert element to linkedlist
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        l.add(4,5);

        l.addFirst(1);
        l.addLast(6);

        //deleting element at head
        l.pop();


        //retriving the element at head
        System.out.println("Element at head by peek(): "+l.peek());
        System.out.println("Element at head by element(): "+l.element());


        //Reverse traversal
        Iterator<Integer> it = l.descendingIterator();
        System.out.println("Reverse traversing");
        while (it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println("\n"+l);

        //size of list
        System.out.println("Size of the list : "+l.size());

    }
}
