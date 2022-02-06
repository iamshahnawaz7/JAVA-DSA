package Quesba;

public class MinimumSwapToSort {
	class Solution 
	{
	    public:
	    //Function to find the minimum number of swaps required to sort the array. 
		 int minSwaps(vector<int>&nums)
	{
	    unordered_map<int,int> mp;
	    for(int i=0;i<nums.size();i++){
	        mp[nums[i]] = i;
	    }
	    sort(nums.begin(),nums.end());
	    int cnt=0;
	    for(int i=0;i<nums.size();){
	        if(mp[nums[i]] != i){
	            swap(nums[i],nums[mp[nums[i]]]);
	            cnt++;
	        }
	        else{
	            i++;
	        }
	    }
	    return cnt;
	    
	}
	};

}
