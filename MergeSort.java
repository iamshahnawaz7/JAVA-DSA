package Sorting;
import java.util.*;
public class MergeSort {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to insert in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements now");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        arr=sort(arr);
        System.out.println("The sorted array is "+Arrays.toString(arr));
	}

public static int[] sort(int [] nums){
    if(nums.length<=1){
        return nums;
    }
    int mid = nums.length/2;
    int [] left = Arrays.copyOfRange(nums,0,mid);
    int [] right = Arrays.copyOfRange(nums,mid,nums.length);
    return merge(sort(left),sort(right));
}

public static int[] merge(int[]a,int[]b) {
	int i=0,k=0,j=0;
	int[] merged=new int[a.length+b.length];
	while(i<a.length && j<b.length) {
		if(a[i]<b[j]) {
			merged[k]=a[i];
			i++;
		}
		else {
			merged[k]=b[j];
			j++;
		}
		k++;
	}
	while(i<a.length) {
		merged[k]=a[i];
		i++;
		k++;
	}
	while(j<b.length) {
		merged[k]=b[j];
		j++;
		k++;
	}
	return merged;
}
}
