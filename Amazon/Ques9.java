public class Ques9 {
    static boolean  isSafe(int arr[][],int r,int c){
        int x=arr[r][c];
        for(int i=0;i<9;i++){
            if(i!=c && arr[r][i]==x){
                return false;
            }
            if(i!=r && arr[i][c]==x){
                return false;
            }
        }
        
        int t1=r/3*3;
        int t2=c/3*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int a=t1+i;
                int b=t2+j;
                if(a!=r && b!=c && arr[a][b]==x){
                    return false;
                }
            }
        }
        return true;
        
    }
    static int isValid(int mat[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]!=0 && !isSafe(mat,i,j)){
                    return 0;
                }
            }
        }
        return 1;
    }
}
