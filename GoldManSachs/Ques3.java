public class Ques3 {
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
       long p=1;
       long count=0;
       long s=0;
       for(long i=0;i<n;i++){
           p*=a[(int)i];
           while(s<i && p>=k){
               p/=a[(int)s];
               s++;
           }
           if(p<k){
               count+=(i-s+1);
           }
       }
       return (int)(count);
    }
}
