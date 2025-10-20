import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the string to count number of vowels : ");
        String str = sc.nextLine();
        str.toLowerCase();
        int vowelcount=0;

        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vowelcount++;
        }
        System.out.println(vowelcount+" vowels found in "+str);
    }
}
