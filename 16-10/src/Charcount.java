public class Charcount {
    public static void main(String[] args) {
        String str = "Pratik   Senapati   ";
        char[] arr = str.toCharArray();
        int count=0;
        for (char i: arr) {
            if (i==' ') continue;
            count++;
        }
        System.out.println("Numbers of character : "+count);
    }
}
