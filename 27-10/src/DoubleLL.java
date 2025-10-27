
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class DoubleLL {
     static Node head = null;
     static Node tail = null;

    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    static void displayReverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }

    static void displayInOrder(Node node){
        Node temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
    }


    static void insertAtBeginning(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    static void insertAtEnd(int data) {
        Node temp = new Node(data);

        if (tail == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    static void insertAtRandom(int index , int data) {
        Node temp = new Node(data);

        if(index==1) insertAtBeginning(data);
        else {
            Node current = head;
            int cur = 1;
            while(current!=null && cur<index) {
                cur++;
                current=current.next;
            }
            if(current==null) insertAtEnd(data);
            else{
                    temp.next=current;
                    temp.prev=current.prev;
                    current.prev.next=temp;
                    current.prev=temp;
            }
        }
    }

    static void deleteAtBeginning() {
        if (head == null) System.out.println("LinkedList is empty");
        else {
            Node temp = head;
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
    }

    static void deleteAtEnd() {
        if (tail == null) System.out.println("LinkedList is empty");
        else {
            Node temp = tail;
            tail=tail.prev;
            temp.prev=null;
            tail.next=null;
        }
    }

    static void deleteAtRandom(int index) {

        if(index==1) deleteAtBeginning();
        else {
            Node current = head;
            int cur = 1;
            while(current!=null && cur<index) {
                cur++;
                current=current.next;
            }
            if(current==null) deleteAtEnd();
            else{
                Node temp=current;
                current.prev.next=temp.next;
                current.next.prev=temp.next.prev;
            }
        }
    }

    static int size(){
        int count=0;
        Node temp=head;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void main(String[] args) {
//        Node a = new Node(5);
//        Node b = new Node(6);
//        Node c = new Node(7);
//        Node d = new Node(8);
//        a.next=b;
//        b.prev=a;
//        b.next=c;
//        c.prev=b;
//        c.next=d;
//        d.prev=c;

        insertAtBeginning(4);
        insertAtEnd(5);
        insertAtEnd(6);
        insertAtEnd(8);
        insertAtRandom(4,7);
        System.out.println("\nSize of the LinkedList : "+size());

        System.out.print("elements in LinkedList : ");
        display(head);

        System.out.print("\nelements in LinkedList in reverse Order : ");
        displayReverse(tail);


        deleteAtBeginning();
        deleteAtEnd();
        deleteAtRandom(4);
        System.out.print("\nelements in LinkedList after deletion : ");
        displayInOrder(head);
    }
}
