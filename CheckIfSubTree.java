package Quesba;

public class CheckIfSubTree {
	class Solution {
	    public static boolean isSubtree(Node T, Node S) {
	        
	        if(T == null && S== null )return true;
	        
	        if(T== null || S== null) return false;
	        
	        if(T.data == S.data){
	            if(isEqual(T, S) ){
	                return true;
	            }
	        }
	        
	        return isSubtree(T.left , S) || isSubtree(T.right , S);
	    }
	    private static boolean isEqual(Node T ,Node S){
	         if(T == null && S== null )return true;
	         if(T== null || S== null) return false;
	         
	         if(T.data == S.data){
	             return isEqual(T.left , S.left) && isEqual(T.right , S.right);
	         }
	         return false;
	    }
	}
}
