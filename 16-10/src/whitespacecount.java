public class whitespacecount {
    public static void main(String[] args) {
        String str = "grewhtg         jhtgbtvgj jhdfhugrbgjf kejhgfyhawr lalbghj";
        int count =0;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c==' ') count++;
        }
        System.out.println("Number of white spaces : "+count);
    }
}
