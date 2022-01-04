package Quesba;

public class SearchPattern {
	class Solution
	{
	    public:
	        vector <int> search(string pat, string txt)
	        {
	            int n1=txt.size();
	            int n2=pat.size();
	            vector<int>result;
	            for(int i=0;i<n1;i++)
	            { int k=0;
	                if(pat[k]==txt[i])
	                {
	         while((pat[k]==txt[i+k])&&(i+k<n1)&&(k<n2))
	                   {
	                       k++;
	                       if(k==n2)
	                       {
	                           result.push_back(i+1);
	                           break;
	                       }
	                   }
	                }
	            }
	            return result;
	        }
	     
	};
}
