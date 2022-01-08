import java.util.*;
public class Ques13 {
    class Pair{
        int x,y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public void solve(Queue<Pair> q,int r,int c,int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int row[]={-1,0,0,1};
        int col[]={0,-1,1,0};
        //roll the oranges in only 4 directions
        for(int i=0;i<4;i++){
            int a=r+row[i];
            int b=c+col[i];
            if(a<0 || b<0 || a>=n || b>=m || arr[a][b]==0 || arr[a][b]==2){
                continue;
            }
            else if(arr[a][b]==1){
                arr[a][b]=2;
                q.add(new Pair(a,b));
            }
        }
    }
    public int orangesRotting(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==2){
                    q.add(new Pair(i,j));
                }
            }
        }
        int timer=0;
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair p=q.poll();
                solve(q,p.x,p.y,arr);
            }
            if(q.size()>0){
                timer++;
            }
            else{
                break;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    return -1;
                }
            }
        }
        return timer;
    }
    
}
