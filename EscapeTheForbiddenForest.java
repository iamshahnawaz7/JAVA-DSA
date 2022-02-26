package Quesba;

public class EscapeTheForbiddenForest {
	class Solution:
		   def build_bridges(self, text1, text2):
		       # code here
		       matrix = [[0 for j in range(len(text2)+1)]for i in range(len(text1)+1)]
		       for i in range(len(text1)-1,-1,-1):
		           for j in range(len(text2)-1,-1,-1):
		               if text1[i] == text2[j]:
		                   matrix[i][j] = 1 + matrix[i+1][j+1]
		               else:
		                   matrix[i][j] = max(matrix[i+1][j], matrix[i][j+1])
		       return matrix[0][0] 
}
