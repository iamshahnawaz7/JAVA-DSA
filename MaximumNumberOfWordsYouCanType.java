package GitHub;

public class MaximumNumberOfWordsYouCanType {
	class Solution {
	    public int canBeTypedWords(String text, String brokenLetters) {
	        String words[] = text.split(" ");
	        char bks[] = brokenLetters.toCharArray();
	        int count = words.length;
	        
	        for(int i=0;i<bks.length;i++)
	            for(int j=0;j<words.length;j++)
	                if(words[j].indexOf(bks[i]) != -1){
	                    words[j] = "";
	                    count--;
	                }
	        return count;
	    }
	}
}
