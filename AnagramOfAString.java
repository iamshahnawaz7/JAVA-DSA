package Quesba;

public class AnagramOfAString {
	class GfG
	{
		public int remAnagrams(String s,String s1)
	        {
	          int n=s.length();
	          int m=s1.length();
	          int count=0;
	          int arr[]=new int[26];
	          for(int i=0;i<n;i++){
	              arr[s.charAt(i)-97]++;
	          }
	          for(int i=0;i<m;i++){
	              arr[s1.charAt(i)-97]--;
	          }
	          for(int i=0;i<26;i++){
	              count+=Math.abs(arr[i]);
	          }
	          return count;
	        }
	}
}
