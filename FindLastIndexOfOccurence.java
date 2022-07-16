package Shazzy;
import java.util.*;
public class FindLastIndexOfOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements you want in an array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements now");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want the last occurence of");
        int target=sc.nextInt();
        int k=(findLastIndexOfOccurence(arr,target,n-1));
        if(k==-1){
            System.out.println("Target element not found at any index");
        }
        else{
            System.out.println("Target element found in index "+k);
        }
    }

    public static int findLastIndexOfOccurence(int arr[],int target,int j){
        if(j<0){
            return -1;
        }
        if (arr[j]==target){
            return j;
        }
        return (findLastIndexOfOccurence(arr, target,j-1));

    }
}

