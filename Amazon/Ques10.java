import java.util.*;
public class Ques10 {
    class Pair{
        char a;
        int ind;
        public Pair(char a,int ind){
            this.a=a;
            this.ind=ind;
        }
    }
    
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        //used hashed mapand sorted accordingly
        Map<Character,Integer> map=new HashMap<>();
        map.put('!',1);
        map.put('#',2);
        map.put('$',3);
        map.put('%',4);
        map.put('&',5);
        map.put('*',6);
        map.put('@',7);
        map.put('^',8);
        map.put('~',9);
        ArrayList<Pair> temp1=new ArrayList<>();
        ArrayList<Pair> temp2=new ArrayList<>();
        for(int i=0;i<n;i++){
            temp1.add(new Pair(nuts[i],map.get(nuts[i])));
            temp2.add(new Pair(bolts[i],map.get(bolts[i])));
        }
        Collections.sort(temp1,(a,b)->(a.ind-b.ind));
        Collections.sort(temp2,(a,b)->(a.ind-b.ind));
        for(int i=0;i<n;i++){
            nuts[i]=temp1.get(i).a;
            bolts[i]=temp2.get(i).a;
        }
    }
    
}
