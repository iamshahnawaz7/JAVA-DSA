package Recursion;

public class PairsOfNonCoincidingPoints {
	 int numOfPairs(int X[], int Y[], int N) {
	        // code here
	        
	        map<int,int> x;
	        map<int,int> y;
	        map<pair<int,int>,int> xy;
	        
	        // Manhattan Distance and the Euclidean Distance between the points would be equal.
	        // if x2=x1 or y1=y2
	        
	        //count distinct x , y ,point(x,y)
	        for(int i=0;i<N;i++){
	            x[X[i]]++;
	            y[Y[i]]++;
	            xy[{X[i],Y[i]}]++;
	        }
	        
	        int xans=0,yans=0,xyans=0;
	        //count pair with same x
	        for(auto it:x){
	            int f=it.second;
	            int af=f*(f-1)/2;
	            xans+=af;
	        }
	        
	        
	        //count pair with same y
	        for(auto it:y){
	            int f=it.second;
	            int af=f*(f-1)/2;
	            yans+=af;
	        }
	        
	        //count pair with same xy
	        for(auto it:xy){
	            int f=it.second;
	            int af=f*(f-1)/2;
	            xyans+=af;
	        }
	        
	        
	        return xans+yans-2*xyans;
	        
	    }
}
