package Sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you want in an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements now");
		for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int min=i;
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		}
		
		System.out.println("The sorted element is");
		for(int element: arr) {
			System.out.println(element);
		}
	}

}
