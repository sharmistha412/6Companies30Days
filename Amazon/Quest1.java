public class Quest1 {
    static int maxProfit(int k, int n, int a[]) {
        int dp[][]=new int[k+1][n];
        for(int i=1;i<k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=1;j<n;j++){
                max=Math.max(dp[i-1][j-1]-(a[j-1]),max);
                dp[i][j]=Math.max(dp[i][j-1],max+(a[j]));
            }
        }
        return dp[k][n-1];
     }
}
