package Recursion;

public class PowerValue {
    /*
    // This leads to TC of O(power)
    static int value(int base , int power) {
    if (power == 0) return 1;
    return base * value(base, power - 1);
    }

     */

    // This leads to TC of O(log power)
    static int value(int base, int power) {
        if (power == 0) return 1;
        int half = value(base, power / 2);
        if (power % 2 == 0) return half * half;
        else return base * half * half;
    }

    public static void main(String[] args) {
        System.out.println( value(5,5));
    }
}
