import java.util.*;
public class Ques6 {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayDeque<Integer> aq=new ArrayDeque<>();
        int j=0,i=0;
        while(j<n){
            while(aq.size()!=0 && aq.peekLast()<arr[j]){
                aq.pollLast();
            }
            aq.add(arr[j]);
            if(j-i+1<k){
                j++;
                continue;
            }
            else if(j-i+1 == k){
                ans.add(aq.peekFirst());
                if(arr[i]==aq.peek()){
                    aq.poll();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
    
}
