package GitHub;

public class RestrictedPacman {
	class Solution{
	    static int candies(int m, int n)
	    {
	        int val=m*n-m-n;
			int count=1;

			boolean chk[]=new boolean[val];


			for (int i=0;i<val ;i=i+n ) {
				for (int j=i;j<val ;j=j+m ) {
					chk[j]=true;
				}
			}

			for (int i=0;i<val ;i++ ) {
				if (!chk[i]) {
					count++;
				}
			}
			return count;
	    }
	}
}
