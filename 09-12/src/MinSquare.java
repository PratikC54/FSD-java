public class MinSquare {
    static int minSquare(int n) {
        int start=0;
        int end=n;
        int ans=0;
        while (start<end) {
            int mid = start+(end-start)/2;
            if(mid<=n/mid) {
                ans=mid;
                start=mid+1;
            }
            else end=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println((int)Math.sqrt(125));
        System.out.println(minSquare(n));
    }
}
