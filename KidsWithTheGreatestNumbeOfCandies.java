package GitHub;

public class KidsWithTheGreatestNumbeOfCandies {
	class Solution {
	    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        ArrayList<Boolean> abc=new ArrayList<>();
	        int a=extraCandies;
	        int m=0;
	        boolean z=false;
	        int n=candies.length;
	        for(int i=0;i<n;i++){
	         z=false;
	         m=candies[i]+a;
	            for(int j=0;j<n;j++){
	                if(candies[j]>m){
	                    abc.add(false);
	                    z=true;
	                     break;
	                  }
	            }
	            if(z==false){
	                abc.add(true);
	              }
	            }
	        return abc;
	         }
	}
}
