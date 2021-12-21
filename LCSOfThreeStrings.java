package Quesba;

public class LCSOfThreeStrings {
	int LCSof3 (string s1, string s2, string s3, int n1, int n2, int n3)
	{
	    // your code here
	    vector< vector< vector<int> > > mat(n1+1, vector< vector<int> >(n2 +1, vector<int>(n3+1,0)));
	     for(int i=n1-1;i>=0;i--)
	        {
	            for(int j=n2-1;j>=0;j--)
	            {
	                    for(int k=n3-1;k>=0;k--)
	                {
	                    if(s1[i]==s2[j] && s2[j]==s3[k])
	                    {
	                        mat[i][j][k]=mat[i+1][j+1][k+1]+1;
	                    }
	                    else
	                    {
	                        mat[i][j][k]=max(mat[i][j][k+1],max(mat[i][j+1][k],mat[i+1][j][k]));
	                    }
	                }
	            }
	        }
	        
	        return mat[0][0][0];
	}
	 
}
