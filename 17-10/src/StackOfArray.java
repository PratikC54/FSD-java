import java.util.Scanner;

public class StackOfArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackOfArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        arr[++top] = item;
    }
    /*
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return arr[top--];
    }

    */

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return;
        }
        top--;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the stack : ");
        int size = sc.nextInt();

        StackOfArray stack = new StackOfArray(size);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        stack.pop();
        stack.pop();

        stack.display();

        stack.push(50);
        stack.push(60);
        stack.push(70);

        stack.display();
    }
}