public class Ques6 {
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        if(n<m){
            return gcdOfStrings(str2,str1);
        }
        if(m==0){
            return str1;
        }
        if(!str1.substring(0,m).equals(str2)){
            return "";
        }
        return gcdOfStrings(str1.substring(m),str2);
    }
}
