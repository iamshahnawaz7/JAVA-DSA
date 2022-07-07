package Shazzy;
import java.util.*;
public class FindFirstIndexOfOccurence {
    static int j=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements you want in an array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements now");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want the first occurence of");
        int target=sc.nextInt();
        System.out.println(findFirstIndexOfOccurence(arr,target,0));
    }

    public static int findFirstIndexOfOccurence(int arr[],int target,int j){
        if(j>=arr.length){
            System.out.println("Target element not found at any index");
            return -1;
        }
        if (arr[j]==target){
            return j;
        }
        return (findFirstIndexOfOccurence(arr, target,j+1));

    }
}
