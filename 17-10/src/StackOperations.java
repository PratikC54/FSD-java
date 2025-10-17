import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Insert element at top
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //Insert element at any index
        stack.insertElementAt(0,0);

        //Remove element at top
        if (!stack.isEmpty()) stack.pop();

        System.out.println("Element at top : "+stack.peek());
        System.out.println("Size of stack : "+stack.size());
        System.out.println("Elements in stack : "+stack);

        //Print element in reverse order
        System.out.println("Elements in stack in reverse order : "+stack.reversed());





    }
}
