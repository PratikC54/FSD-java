public class Product {
    static int product(int num1 , int num2) {
        if (num1==0 || num2==0) return 0;
        return num1+product(num1,num2-1);
    }

    public static void main(String[] args) {
        System.out.println(product(2,3));
    }
}
