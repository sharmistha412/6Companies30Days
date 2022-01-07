public class Ques7 {
    //n is the number of childers
    //m is the number of items
    //k is the start position
    public int lastPosition(int n,int m,int k){
        int ans=(k+m-1)%n;
        if(ans==0){
            return n;
        }
        else{
            return ans;
        }
    }
}
