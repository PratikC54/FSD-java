public class RreverseOfNumber {
    static int reverse =0;
    static int reverseNumber(int num) {
        if(num==0) return 0;
        int last = num%10;

        reverse =reverse*10+last;
        reverseNumber(num/10);
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }
}
