import java.util.Scanner;

public class PrintChar {
    static void printChar(String str) {
        if(str.isEmpty()) return;
        System.out.print(str.charAt(0)+" ");
    printChar(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to print characters : ");
        String str = sc.next();
        printChar(str);
    }
}
