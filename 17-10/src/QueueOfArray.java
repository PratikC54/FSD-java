import java.util.Scanner;

public class QueueOfArray {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public QueueOfArray(int size) {
        arr = new int[size];
        capacity = size;
        rear = -1;
        front = 0;
    }

    public void add(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot push " + item);
            return;
        }
        arr[++rear] = item;
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot pop");
            return -1;
        }
        arr[front]=0;
        return arr[front++];
    }

    public int peek(){
        return arr[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int size() {
        if (isEmpty()) return 0;
        return rear - front + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the stack : ");
        int size = sc.nextInt();

        QueueOfArray queue1 = new QueueOfArray(size);

        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);

        System.out.println("Size of queue : "+queue1.size());
        System.out.println("Deleted element : "+queue1.poll());
        System.out.println("Size of queue : "+queue1.size());
        System.out.println("element at front : "+queue1.peek());
        queue1.display();

    }
}
