public class RemoveVowel {
    public static void main(String[] args) {
        String str1 = "Elephant is a big animal";
        StringBuilder str = new StringBuilder();
        for (int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            if (!"AEIOUaeiou".contains(c+"")) str.append(c);
        }
        System.out.println(str);

    }
}
