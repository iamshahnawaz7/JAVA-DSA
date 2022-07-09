package Shazzy;
import java.util.*;
public class FindAllIndicesInAnArray {
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
        findAllIndicesInAnArray(arr,target,0);
    }

    public static void findAllIndicesInAnArray(int arr[],int target,int j){
        boolean z=false;
        if(j>arr.length-1){
            return;
        }
        if (arr[j]==target){
            System.out.println("Index: "+j);
            z=true;
        }
        findAllIndicesInAnArray(arr, target,j+1);
    }
}

