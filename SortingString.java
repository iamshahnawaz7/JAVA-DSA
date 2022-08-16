package PracticeQuestion;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		String a= "vinitgupta";
		int arr[]=new int[26];
		Arrays.fill(arr, 0);
		for(int i=0;i<a.length();i++) {
			int b=a.charAt(i)-'a';
			arr[b]++;
		}
        
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]!=0) {
			   for(int j=0;j<arr[i];j++) {
				   System.out.println(('a'+i)+"  "+(char)('a'+i));
				   
			   }
		   }
	   }
	}

}
