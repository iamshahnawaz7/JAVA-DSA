package Quesba;

public class PalindromePairs {
	class Solution{   
		  public:
		    // Function to check if a palindrome pair exists
		    bool palindromepair(int n, string arr[]) {
		       // code here
		          unordered_map<string,int>m;
		      for(int i=0;i<n;i++){
		          auto s=arr[i];
		          reverse(s.begin(),s.end());
		          m.insert({s,i});
		          //m[s]=i;
		      }
		      for(int i=0;i<n;i++){
		          for(int j=0;j<arr[i].size();j++){
		              string s1=arr[i].substr(0,j);
		              string s2=arr[i].substr(j);
		              if(m.count(s1)&&ispalindrome(s2)&&m[s1]!=i){
		                  return true;
		              }
		              if(m.count(s2)&&ispalindrome(s1)&&m[s2]!=i){
		                  return true;
		              }
		          }
		      }
		      return false;
		   }
		   bool ispalindrome( string s){
		       int len=s.length(),i;
		       int j=len-1;
		       for( i=0;i<=j;i++){
		           if(s[i]!=s[j]) break;
		           else j--;
		       }
		       if(i>j) return true;
		       else return false;
		   }

		};
}
