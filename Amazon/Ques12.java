//import java.util.*;
public class Ques12 {
    String colName (long n)
    {
        StringBuilder s=new StringBuilder();
        while(n>0){
            long temp=(n)%26;
            if(temp==0){
                s.insert(0,'Z');
                n=(n/26)-1;
            }
            else{
                char a=(char)('A'+(temp-1));
                s.insert(0,a);
                n=n/26;
            }
        }
        return s.toString();
    }
    
}
