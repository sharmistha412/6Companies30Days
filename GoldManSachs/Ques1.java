import java.util.*;

public class Ques1{
    public List<List<String>> Anagrams(String[] string_list) {
        int n=string_list.length;
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String word=string_list[i];
            char a[]=word.toCharArray();
            Arrays.sort(a);
            String newword=new String(a);
            
            if(map.containsKey(newword)){
                map.get(newword).add(word);
            }else{
                List<String> words=new ArrayList<>();
                words.add(word);
                map.put(newword,words);
            }
        }
        for(String s : map.keySet()){
            List<String> a=map.get(s);
            ans.add(a);
        }
        return ans;
    }
}