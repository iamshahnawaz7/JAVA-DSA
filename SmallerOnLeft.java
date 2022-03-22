package Recursion;

public class SmallerOnLeft {
	vector<int> Smallestonleft(int arr[], int n)
	{
	   // Complete the function
	   vector<int> ans;
	   ans.push_back(-1);
	   
	   set<int> st;
	   st.insert(arr[0]);
	   
	   for(int i=1; i<n; i++){
	       st.insert(arr[i]);
	       auto it = st.lower_bound(arr[i]);
	      
	       
	       while(it!=st.begin()){
	           if(*it<arr[i]) break;
	           it--;
	       }
	       
	       if(*it<arr[i]) ans.push_back(*it);
	       else ans.push_back(-1);
	   }
	   return ans;
	}
}
