package Recursion;

public class printing {
    // 5 4 3 2 1 2 3 4 5
    static void print(int num) {
        if(num==0 ) return;
        System.out.print(num+" ");
        print(num-1);
        if (num==1) return;
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        print(5);

    }
}