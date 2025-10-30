public class Permutation {
    static void permutation(String str,String s) {
        if(str.isEmpty()) return;
        if(s.length()==str.length()) return;
        permutation(str, s);
    }

    public static void main(String[] args) {

    }
}
