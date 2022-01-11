import java.util.*;
public class Ques7 {
    final static int MAX_CHAR = 256;
    public String FirstNonRepeating(String A)
    {
        StringBuilder s=new StringBuilder();
        boolean[] repeated = new boolean[MAX_CHAR];
        ArrayList<Character> inDLL = new ArrayList<Character>();
        for (int i = 0; i < A.length(); i++) {
            char x = A.charAt(i);
            if (!repeated[x]) {
                if (!(inDLL.contains(x))) {
                    inDLL.add(x);
                }
                else 
                {
                    inDLL.remove((Character)x);
                    repeated[x]= true;
                }
            }

            if (inDLL.size() != 0) {
                s.append(inDLL.get(0));
            }
            else{
                s.append("#");
            }
        }
        return s.toString();
    } 
}
