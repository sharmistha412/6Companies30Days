public class Ques14 {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int ans=Integer.MAX_VALUE;
        int sum=0;
        boolean falg=true;
        while(j<n){
            sum+=nums[j];
            if(sum<target){
                j++;
                continue;
            }
            else if(sum>=target){
                falg=false;
                while(sum>=target){
                    ans=Math.min(ans,j-i+1);
                    sum-=nums[i];
                    i++;
                }
                j++;
            }
        }
        if(falg){
            return 0;
        }
        return ans;
    }
}
