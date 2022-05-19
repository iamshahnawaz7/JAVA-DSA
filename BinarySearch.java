package Shazzy;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elemnts you want to insert in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements now");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value you want to search");
        int target=sc.nextInt();
        binarySearch(arr,0,n-1, target);
    }
    /**
     * Binary Search
     */
    public static void binarySearch(int arr[],int low,int high,int target) {
        int mid= low + (high-low)/2;
        while( low <= high ){
            if ( arr[mid] < target){
                low = mid + 1;
            }else if ( arr[mid] == target ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                high= mid - 1;
            }
            mid =low+ (high-low)/2;
        }
        if ( low > high ){
            System.out.println("Element is not found!");
        }
    }
}
