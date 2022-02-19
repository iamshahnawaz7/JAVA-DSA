package Quesba;

public class FindTheNumberOfIslands {
	class Solution {
		private:
		    void dfs(vector<vector<char>>& matrix, int x, int y, int row, int col) {
		        //handling boundary cases
		        if(x<0 || x>=row || y<0 || y>=col || matrix[x][y] != '1') return;
		        
		        // Mark current cell as visited
		        matrix[x][y] = '2';
		        
		        // Checking for all 8 directions
		        int dx[8] = {1, 0, -1, 0, 1, 1, -1, -1};
		        int dy[8] = {0, 1, 0, -1, 1, -1, -1, 1};
		        
		        for(int i=0; i<8; i++) {
		            dfs(matrix, x + dx[i], y + dy[i], row, col);
		        }
		    }
		public:
		    // Function to find the number of islands.
		    int numIslands(vector<vector<char>>& grid) {
		        int row = grid.size();
		        int col = grid[0].size();
		        
		        int island = 0;
		        for(int i=0; i<row; i++) {
		            for(int j=0; j<col; j++) {
		                if(grid[i][j] == '1') {
		                    dfs(grid, i, j, row, col);
		                    island++;
		                }
		            }
		        }
		        return island;
		    }
		};
}
