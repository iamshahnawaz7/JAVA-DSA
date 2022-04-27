package Recursion;

public class KillingSpree {
long long int killinSpree(long long int n)
   {
       // Code Here
       int i=1;
       int c=0;
       while(n>0)
       {
           n-=i*i;
           if(n>=0)
           c++;
           i++;
       }
       return c;                
   }
}
