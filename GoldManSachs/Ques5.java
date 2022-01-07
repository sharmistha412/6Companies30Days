public class Ques5 {
    long getNthUglyNo(int n) {
        // code here
        long dp[]=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        int p1=1,p2=1,p3=1;
        for(int i=2;i<n+1;i++){
            long f1=2*dp[p1];
            long f2=3*dp[p2];
            long f3=5*dp[p3];
            dp[i]=Math.min(f1,Math.min(f2,f3));
            if(f1==dp[i]){
                p1++;
            }
            if(f2==dp[i]){
                p2++;
            }
            if(f3==dp[i]){
                p3++;
            }
        }
        return dp[n];
    }
}
