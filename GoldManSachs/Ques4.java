public class Ques4 {
    String encode(String str)
	{
          //Your code here
          StringBuilder s=new StringBuilder();
          int count=1;
          str+="%";
          char arr[]=str.toCharArray();
          for(int i=1;i<str.length();i++){
              if(arr[i]!=arr[i-1]){
                  s.append(arr[i-1]);
                  s.append(count);
                  count=1;
              }
              else{
                  count++;
              }
          }
          return s.toString();
	}
}
