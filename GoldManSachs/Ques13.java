import java.util.*;
public class Ques13 {
    static String decodedString(String s){
        Stack<Character> stack=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(i==0 && !(Character.isDigit(a))){
                while(i<s.length() && !(Character.isDigit(s.charAt(i)))){
                    ans.append(s.charAt(i));
                    i++;
                }
                i--;
            }
           else if(a==']'){
               StringBuilder temp=new StringBuilder();
               while(stack.peek()!='['){
                   temp.append(stack.pop());
               }
               stack.pop();
               StringBuilder temp3=new StringBuilder();
               while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                   temp3.append(stack.pop());
               }
               temp3.reverse();
               int aa=Integer.valueOf(temp3.toString());
               temp.reverse();
               StringBuilder temp1=new StringBuilder();
               while(aa-->0){
                   temp1.append(temp);
               }
               if(stack.size()==0 || stack.peek()==']'){
                   ans.append(temp1);
               }
               else{
                   for(char p : temp1.toString().toCharArray()){
                       stack.push(p);
                   }
               }
               
           }
           else{
               stack.push(a);
           } 
        }
        StringBuilder temp1=new StringBuilder();
        while(stack.size()!=0){
           temp1.append(stack.pop()); 
        }
        temp1.reverse();
        ans.append(temp1.toString());
        return ans.toString();
    }
}
