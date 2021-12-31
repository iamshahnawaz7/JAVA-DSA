package Quesba;

public class EvaluationOfPostFixExpression {
	class Solution
	{
	    public:
	    //Function to evaluate a postfix expression.
	    int evaluatePostfix(string S)
	{
		stack<int> st;
	    int n = S.length();
	    for(int i=0; i<n; i++)
	    {
	        if(S[i]==' ')
	            continue;
	        else if(isdigit(S[i]))
	        {
	            st.push(S[i]-'0');
	        }
	        else
	        {
	            int A = st.top();
	                st.pop();
	            int B = st.top();
	                st.pop();
	            
	            switch(S[i])
	            {
	                case '+': st.push(B+A);
	                break;
	                case '-': st.push(B-A);
	                break;
	                case '*': st.push(B*A);
	                break;
	                case '/': st.push(B/A);
	                break;
	            }
	        }
	    }
	    return st.top();
	}
	};
}
