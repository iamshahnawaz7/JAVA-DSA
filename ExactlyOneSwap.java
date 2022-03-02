package Quesba;

public class ExactlyOneSwap {
	class Solution
	{
	public:
	   long long countStrings(string S)
	   {
	       // code here
	       
	       long long n = S.size();
	       vector<long long> cha(26,0);  //for Counting the frequency of characters
	       
	       for(int i = 0; i < S.length(); i++){
	           cha[S[i] - 'a']++;
	       }
	       
	       bool flag = false;
	       long long ans = n*(n-1)/2;
	       for(int i = 0; i < 26; i++){
	           if(cha[i] > 1) flag = true;   //If the character is repeating
	           {
	               ans -= cha[i]*(cha[i] - 1)/2;
	           }
	       }
	       return flag ? ans+1 : ans;
	   }
	};

}
