package Recursion;

public class CheckMirrorInNAryTree {
	class Solution:
		   def checkMirrorTree(self, n, e, A, B):
		        dictA={}
		        dictB={}
		        for x in range(0,2*e,2):
		            if A[x] in dictA:
		                dictA[A[x]].append(A[x+1])
		            else:
		                dictA[A[x]]=[A[x+1]]
		            if B[x] in dictB:
		                dictB[B[x]].append(B[x+1])
		            else:
		                dictB[B[x]]=[B[x+1]]
		        for x in dictA:
		            if dictA[x]!=list(reversed(dictB[x])):
		                return 0
		        return 1
}
