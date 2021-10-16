package GitHub;

public class CountDistinctElementsInEveryWindow {
	class Solution
	{
	     static ArrayList<Integer> countDistinct(int [] A, int n, int k)
	    {
	        // code here
	        HashMap<Integer,Integer> map = new HashMap<>();
	        ArrayList<Integer> counts = new ArrayList<>();
	        int i=0,j=0,count = 0;
	        while(j<n){
	            int jCount = 1;
	            if(!map.containsKey(A[j])) {
	                count++;
	                map.put(A[j],jCount);
	            }
	            else {
	                jCount = map.get(A[j]);
	                map.put(A[j],++jCount);
	                if(jCount==1) count++;
	            }
	            if(j>=k-1){
	                counts.add(count);
	                int iCount = map.get(A[i])-1;
	                map.put(A[i],iCount);
	                if(iCount==0) count--;
	                i++;
	            }
	            j++;
	        }
	        return counts;
	    }
	}
}
