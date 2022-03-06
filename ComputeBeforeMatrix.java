package Recursion;

public class ComputeBeforeMatrix {
	vector<vector<int>> computeBeforeMatrix(int N, int M, vector<vector<int>> after){
        // Code here
        vector<vector<int>> before(N, vector<int>(M, 0));
        for(int i = 0 ; i < N ; i++){
            for(int j = 0;  j < M; j++){
                int left = j-1 < 0 ? 0 : after[i][j-1];
                int up = i-1 < 0 ? 0 : after[i-1][j];
                int diag = 0;
                if(i-1 >= 0 && j-1>=0 ){
                    diag = after[i-1][j-1];
                }
                before[i][j] = after[i][j] - left - up + diag; 
            }
        }
        return before;
    }
}
