package GitHub;

public class ConvertBinaryNumberInALinkedListToInteger {
	class Solution {
	    public int getDecimalValue(ListNode head) {
	        ListNode curr=head;
	        int num=0;
	        while(curr!=null){
	            num=num*2+curr.val;
	            curr=curr.next;
	        }
	        return num;
	    }
	}
}
