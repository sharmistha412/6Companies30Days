import java.util.*;
public class Ques15 {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=nums[i]%k;
            if(rem<0){
                rem+=k;
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        
        for(int a : nums){
            int rem=a%k;
            if(rem<0){
                rem+=k;
            }
            int v1=map.get(rem);
            if(rem==0){
                if((v1%2)==1){
                return false;
                }
            }
            else if(2*rem==k){
                if((v1%2)==1){
                return false;
                }
            }
            else{
                int v2=map.getOrDefault(k-rem,0);
                if(v1!=v2){
                    return false;
                }
            }
        }
        return true;
    }
}
