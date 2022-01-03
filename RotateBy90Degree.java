package Quesba;

public class RotateBy90Degree {
	void rotate(vector<vector<int> >& matrix)
	{
	    // Your code goes here
	    // vector<vector<int>> res(matrix.size(),vector<int>(matrix.size()));       //
	    // for(int i=matrix.size()-1;i>=0;i--){                                     //S.C.:-O(N) It will work but question expects Space
	    //     for(int j=0;j<matrix.size();j++)                                     //complexity of O(1)
	    //     res[matrix.size()-1-i][j]=matrix[j][i];                              //
	    // }
	    // matrix=res;
	    
	   // S.C.:-O(1)
	    for(int i=0;i<matrix.size();i++){
	        for(int j=0;j<i;j++)
	        swap(matrix[i][j],matrix[j][i]);
	    }
	    for(int i=0;i<matrix.size()/2;i++){
	        for(int j=0;j<matrix.size();j++)
	        swap(matrix[i][j],matrix[matrix.size()-1-i][j]);
	    }
	}
}
