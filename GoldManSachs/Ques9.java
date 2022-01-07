public class Ques9 {
    static String printMinNumberForPattern(String S){
        // code here
        int n=S.length();
        String ans="";
        for(int i=1;i<=(n+1);i++){
            ans+=i;
        }
        for(int i=0;i<n;i++){
            char a=S.charAt(i);
            if(a=='D'){
                int k=i;
                int count=1;
                while(i<n-1 && S.charAt(i+1)=='D'){
                    count++;
                    i++;
                }
                ans=reverse(ans,k,k+count);
            }
        }
        return ans;
    }
    static String reverse(String ans,int x,int y){
        char arr[]=ans.toCharArray();
        while(x<y){
            char t=arr[x];
            arr[x]=arr[y];
            arr[y]=t;
            x++;
            y--;
        }
        return String.valueOf(arr);
    }
}
