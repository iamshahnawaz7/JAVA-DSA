package GitHub;

public class SpiralMatrix {

class Solution
{

	     public int findK(int [][]a, int m, int n, int c)
    {
        int i, k = 0, l = 0;
        int count = 0;


        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                count++;

                if (count == c)
                   return a[k][i];
            }
            k++;
            for (i = k; i < m; ++i) {
                count++;

                if (count == c)
                    return a[i][n - 1];
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    count++;

                    if (count == c)

                        return a[m - 1][i];
                }
                m--;
            }

            /* check the first column from
                    the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    count++;

                    if (count == c)
                        return a[i][l];
                }
                l++;
            }
        }
        return -1;
	}
	
}
}
