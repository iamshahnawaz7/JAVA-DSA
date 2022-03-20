package Recursion;

public class MinimumNumberOfTimesAHasToBeRepeatedSuchThatBBecomesItsSubstring {

ciph3rcodes
4 weeks ago

#JAVA EASY SOLUTION(JOIN LINKEDIN FOR DISCUSSION)

 

class Solution {
   static int minRepeats(String A, String B) {
      int l1=A.length();
      int l2=B.length();
      int c=-1;
      String str=A;
      if(l1>=l2){
          if(A.contains(B))
           return 1;
           else
           return -1;
      }
      int co=1;
      while(true){
          str=str+A.substring(0,l1);
          co++;
          if(str.contains(B))
           return co;
           
           if(str.length()>4*l2)
            return -1;
      }
      
   }
};


}
