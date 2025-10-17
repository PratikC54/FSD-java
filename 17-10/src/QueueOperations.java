import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        //Insert element to Queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        //Delete element from Queue
        queue.poll();
        queue.remove();     // Throws exception if queue is empty

        //Size of queue
        System.out.println("Size of queue : "+queue.size());

        //returns the element at front
        System.out.println("Element at front index : "+queue.peek());

        //Printing the queue
        System.out.println(queue);



    }
}
