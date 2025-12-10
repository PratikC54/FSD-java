package DynamicProgramming;

public class Fibonacci {
    public static int fib(int num) {
        int[] dp = new int[num+1];
        dp[0]=0;
        if(num>0) dp[1]=1;
        for(int i=2;i<=num;i++) dp[i] = dp[i-1]+dp[i-2];
        return dp[num];
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
