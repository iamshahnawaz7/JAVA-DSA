package Quesba;

public class FindRectangleWithCorners1 {
	class Solution
	{
	   public:
	   bool ValidCorner(const vector<vector<int> >& matrix)
	   {
	   int a=matrix.size(),c=matrix[0].size();
	   for(int i=0;i<a;i++)
	       {
	       for(int j=0;j<c;j++)
	           {
	           if(matrix[i][j]==1)
	               {
	               int right,down;
	                   for(right=j+1;right<c;right++)
	                   {                     
	                       if(matrix[i][right]==1)
	                       {
	                           for(down = i+1;down<a;down++)
	                           {
	                               if(matrix[down][right]==1)
	                               {
	                                   if(matrix[down][j]==1)return true;
	                               }
	                           }
	                       }
	                   }
	               }
	           }
	       }
	       return false;
	   }
	};
	  
}
