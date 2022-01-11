import java.util.*;
public class Ques8 {

    Long countWays(int m)
    {
        // your code here
        long dp[]=new long[m+1];
        Arrays.fill(dp,1);
        for(int i=2;i<m+1;i++){
            dp[i]+=dp[i-2];
        }
        return dp[m];
    }    
    
}
