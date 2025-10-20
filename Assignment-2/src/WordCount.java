import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a sentence to count words : ");
        String str = sc.nextLine().trim();

        String[] word = str.split(" ");
        System.out.println("Numbers of words : "+word.length);
    }
}
