package Quesba;

public class HitMostBallons {
class Solution {
    public int mostBalloons(int N, int arr[][]) {
        // Code here
        
        /*The logic is the balloons present on the line connecting
            start and target point bursts.To check if there are on the same line
            we calculate the slope of the line and store number of points present on the line
            Here slope is a double value . 
        */
        int ans=0;
        for(int i=0;i<N;i++) {
            int x1=arr[i][0],y1=arr[i][1];
            HashMap<Double,Integer> hm=new HashMap<>();
            int count=0;
            for(int j=0;j<N;j++) {
                int x2=arr[j][0],y2=arr[j][1];
                if(x1==x2 && y1==y2){
                    count++;
                    continue;
                }
                double slope=((double)(y2-y1)/(double)(x2-x1));
                hm.put(slope,hm.getOrDefault(slope,0)+1);
            }
            for(double z: hm.keySet()){
                ans=Math.max(ans,count+hm.get(z));
            }
        }
        return ans;
    }
}
}
