package GitHub;

public class GoalParserInterpretation {
	class Solution {
	     public String interpret(String command) {
	        String str="";
	         for(int i=0;i<command.length();i++){
	            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
	                str+="o";
	                i++;
	            }
	          else if(command.charAt(i)=='(' && command.charAt(i+1)=='a')
	             {
	          str+="al";
	            i=i+3;
	             }
	             else
	                 str+=command.charAt(i);
	           }
	        return str;
	    }
	}
	    
}
