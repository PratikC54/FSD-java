class TrieNode{
    TrieNode[] child;
    boolean EndOfWord;

    public TrieNode() {
        EndOfWord=false;
        child = new TrieNode[25];
    }
}
public class TrieDS {

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


    public static void display(TrieNode root , String str) {
        if(root.EndOfWord) System.out.print(str+" ");
        for(int i=0;i<25;i++) {
            if(root.child[i]!=null) {
                char ch = (char) (i+'a');
                display(root.child[i],str+ch);
            }
        }
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
    public static void main(String[] args) {
        String[] str = {"An","and","ant","ball","bat"};
        for(String s : str) insert(s);
        display(root,"");
        if (search("azsdfant")) System.out.println("\nFound successfully");
        else System.out.println("\nNot present in trie....");


    }
}
