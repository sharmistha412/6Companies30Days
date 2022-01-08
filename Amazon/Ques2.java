public class Ques2 {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int lis[]=new int[n];
        int lds[]=new int[n];
        lis[0]=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                lis[i]=lis[i-1]+1;
            }
            else{
                lis[i]=1;
            }
        }
        lds[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                lds[i]=lds[i+1]+1;
            }
            else{
                lds[i]=1;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(lis[i]!=1 && lds[i]!=1){
                max=Math.max(max,(lis[i]+lds[i]-1));
            }
        }
        return max;
    }
    
}
