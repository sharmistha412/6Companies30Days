import java.util.*;
class TrieNode
{
    HashMap<Character,TrieNode> child;
    boolean end;
    public TrieNode()
    {
        child = new HashMap<Character,TrieNode>();
        for (char i = 'a'; i <= 'z'; i++)
             child.put(i,null);
        end = false;
    }
}

public class Ques5 {

    static TrieNode root;
    static void insert(String s){
        TrieNode itr=root;
        for(int i=0;i<s.length();i++){
            TrieNode nextNode = itr.child.get(s.charAt(i));
            if (nextNode == null){
                nextNode = new TrieNode();
                itr.child.put(s.charAt(i),nextNode);
            }
            itr = nextNode;
            if (i == s.length() - 1){
                itr.end = true;
            }
        }
    }
    public static  void displayContactsUtil(TrieNode curNode,
                                   String prefix,ArrayList<String> temp)
    {
        if (curNode.end)
            temp.add(new String(prefix));
  
        for (char i = 'a'; i <= 'z'; i++)
        {
            TrieNode nextNode = curNode.child.get(i);
            if (nextNode != null)
            {
                displayContactsUtil(nextNode, prefix + i,temp);
            }
        }
    }
    static void displayContacts(String str ,ArrayList<ArrayList<String>> ans)
    {
        TrieNode prevNode = root;
        String prefix = "";
        int len = str.length();
        int i;
        for (i = 0; i < len; i++)
        {
            ArrayList<String> temp=new ArrayList<>();
            prefix += str.charAt(i);
            char lastChar = prefix.charAt(i);
            TrieNode curNode = prevNode.child.get(lastChar);
            if (curNode == null)
            {
                
                break;
            }
            displayContactsUtil(curNode, prefix,temp);
            ans.add(temp);
            prevNode = curNode;
        }
        for ( ; i < len; i++)
        {
            ArrayList<String> temp=new ArrayList<>();
            String a="0";
            temp.add(a);
            ans.add(temp);
        }
    }
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        root=new TrieNode();
        for(int i=0;i<n;i++){
            insert(contact[i]);
        }
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        displayContacts(s,ans);
        return ans;
    }
    
}
