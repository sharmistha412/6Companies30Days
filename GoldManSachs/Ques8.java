public class Ques8 {
    int m=1000000007;
    public int CountWays(String str)
    {
        int n=str.length();
        int dp[]=new int[n];
        dp[0]=1;
        if(str.charAt(0)=='0'){
            return 0;
        }
        for(int i=1;i<n;i++){
            char a=str.charAt(i-1);
            char b=str.charAt(i);
            if(a=='0' && b=='0'){
                dp[i]=0;
            }
            else if(b=='0' && a!='0'){
                if(a=='1' || a=='2'){
                    dp[i]=(i>=2)?(dp[i-2]%m):1;
                }
                else{
                    dp[i]=0;
                }
            }
            else if(b!='0' && a=='0'){
                dp[i]=(dp[i-1]%m);
            }
            else if(a!='0' && b!='0'){
                String temp="";
                temp+=a;
                temp+=b;
                int p=Integer.valueOf(temp);
                if(p<=26){
                    dp[i]=dp[i-1]%m + ((i>=2)? dp[i-2]%m : 1);
                }
                else{
                    dp[i]=dp[i-1]%m;
                }
            } 
        }
        return dp[n-1]%m;
    }
}
