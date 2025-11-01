class TrieNode{
    TrieNode[] child;
    boolean EndOfWord;

    public TrieNode() {
        EndOfWord=false;
        child = new TrieNode[25];
    }
}

public class PharseSearch {
    public static TrieNode root = new TrieNode();
    static void insert(String str) {
        TrieNode temp = root;
        if(temp==null) return;
        for(char c : str.toCharArray()){
            c=Character.toLowerCase(c);
            if (temp.child[c - 'a'] == null) temp.child[c - 'a'] = new TrieNode();
            temp = temp.child[c-'a'];
        }
        temp.EndOfWord=true;
    }

    public static boolean search(String str) {
        TrieNode temp = root;
        for(char c : str.toCharArray()){
            c=Character.toLowerCase(c);
            if((c-'a')>=25 || (c-'a')<0) return false;
            if(temp.child[c-'a']==null) return false;
            temp = temp.child[c-'a'];
        }
        return temp.EndOfWord;
    }

    public static boolean searchPhrase(String key) {
        if(key.isEmpty()) return true;
        for(int i=0;i<=key.length();i++){
            String first = key.substring(0,i);
            String second = key.substring(i);
            if (search(first) && searchPhrase(second)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] str = {"An","and","ant","ball","bat"};
        for(String s : str) insert(s);
        System.out.println(searchPhrase("anand"));

    }
}
