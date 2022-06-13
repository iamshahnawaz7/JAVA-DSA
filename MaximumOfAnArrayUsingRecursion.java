/**
 * MaximumOfAnArrayUsingRecursion
 */
import java.util.*;
public class MaximumOfAnArrayUsingRecursion {
    static int c=0,max=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements now");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=arr.length;
       System.out.println("The maximum element is " +maxOf(arr,a));
    }

public static int maxOf(int arr[],int n){
    if(c==n-1){
        return Math.max(arr[c], max);
    }
    max=Math.max(max, arr[c]);
    return maxOf(arr, c+1);
}
}