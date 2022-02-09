package Quesba;

public class SortBySetBitCount {
	class Solution{
	    public:
	    static bool compare(int a, int b)
	    {
	        a = __builtin_popcount(a);
	        b = __builtin_popcount(b);
	        return a>b;
	    }
	    void sortBySetBitCount(int arr[], int n)
	    {
	        stable_sort(arr, arr+n, compare);
	    }
	};
}
