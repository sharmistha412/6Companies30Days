
import java.util.*;
public class Ques3 {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        ArrayDeque<Integer> pq=new ArrayDeque<>();
        int j=0,i=0;
        while(j<n){
            while(pq.size()>0 && pq.peekLast()<arr[j]){
                pq.pollLast();
            }
            pq.add(arr[j]);
            if(j-i+1<k){
                j++;
                continue;
            }
            else if(j-i+1 == k){
                ans.add(pq.peek());
                if(arr[i]==pq.peek()){
                    pq.poll();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
    
}
