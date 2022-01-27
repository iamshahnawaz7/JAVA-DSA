package Quesba;

public class Handshakes {
	class Solution:
		   def count(self, N):
		       result=0
		       if(N%2==1):
		           return 0
		       elif(N==0):
		           return 1
		       for i in range(0,N,2):
		           result+=self.count(i)*self.count(N-2-i)
		       return result
}
