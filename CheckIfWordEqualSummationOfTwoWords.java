package GitHub;

public class CheckIfWordEqualSummationOfTwoWords {
	class Solution {
		   public static int getNum(String str)
		    {   int val =0;
		        for(int i=0;i<str.length();i++)
		        {
		            int rem = str.charAt(i)-'a';
		            val = val*10 + rem;
		        }
		     return val;
		    }
		    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		        if(getNum(firstWord)+getNum(secondWord)==getNum(targetWord))
		            return true;
		        else
		            return false;
		    }
		}
}
