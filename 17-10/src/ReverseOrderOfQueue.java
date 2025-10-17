import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrderOfQueue {

    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Original Queue: " + queue);

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }


        System.out.print("In reverse order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        reverseQueue(queue);
    }
}