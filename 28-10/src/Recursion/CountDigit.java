package Recursion;

public class CountDigit {
    static int number(int num) {
        if(num==0) return 0;
        return number(num/10)+1;
    }

    public static void main(String[] args) {
        System.out.println(number(12345));


        int c = (int) (Math.log10(12345)+1);
        System.out.println(c);
    }
}
