import java.util.*;
public class FibonacciSeries {
    static int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index of fibonacci series : ");
        int n = sc.nextInt();

        System.out.print("fibonacci series is : ");
        for (int i=0;i<=n;i++){
            System.out.print(fib(i)+" ");
        }

        System.out.println();
        System.out.println("Element at index "+n+" of fibonacci series : "+fib(n));
    }
}