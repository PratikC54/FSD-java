package Recursion;

public class GCD {
    /*
    static int gcd(int a , int b) {
        int x = a>b ? a:b;
        int y = b<a ? b:a;
        while(x%y!=0){
            int z=x%y;
            x=y;
            y=z;
        }
        return y;
    }

     */

    static int gcd(int a , int b) {
        if (b == 0) return a;
        if (a == 0) return b;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(16,64));
    }
}
