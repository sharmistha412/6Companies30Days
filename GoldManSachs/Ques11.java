public class Ques11 {
    int[] findTwoElement(int arr[], int n) {
        // code here
        //FIRST MISSING NUMBER LOGIC
        int result[]=new int[2];
        for(int i=0;i<n;i++){
            int p=Math.abs(arr[i]);
            if(arr[p-1]>0){
                arr[p-1]=-arr[p-1];
            }
            else{
                result[0]=Math.abs(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                result[1]=i+1;
                break;
            }
        }
        return result;
    }
}
