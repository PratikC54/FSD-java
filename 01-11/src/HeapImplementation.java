
class Heap{
    public static int[] arr = new int[10];
    public static int size;

    public static int parent(int i){
        return (i-1)/2;
    }

    public static void insert(int value) {
        if(size== arr.length) return;
        arr[size]=value;
        int current=size;
        size++;
        while(current>0 && arr[current]>arr[parent(current)]) {
            swap(current,parent(current));
            current = parent(current);
        }
    }

    public static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    public static void delete(){
        if(size==0) return;
        arr[0] = arr[size-1];
        size--;

        int i=0;
        while(i<size) {
            int leftchildindex = (i*2)+1;
            int rightchildindex = (i*2)+2;
            int largest=i;
            if(size>leftchildindex && arr[largest]<arr[leftchildindex]) {
                largest=leftchildindex;
            }
            if(size>rightchildindex && arr[largest]<arr[rightchildindex]) {
                largest=rightchildindex;
            }
            if(largest!=i) {
                swap(i,largest);
                i=largest;
            }
            else return;
        }

    }

    public static void displayHeap(){
        for(int i=0 ;i<size;i++) System.out.print(arr[i]+" ");
    }
}

public class HeapImplementation {
    public static void main(String[] args) {
        Heap.insert(1);
        Heap.insert(2);
        Heap.insert(3);
        Heap.insert(0);
        Heap.insert(6);
        Heap.displayHeap();
        Heap.delete();
        System.out.println("\nAfter deletion");
        Heap.displayHeap();


    }
}
