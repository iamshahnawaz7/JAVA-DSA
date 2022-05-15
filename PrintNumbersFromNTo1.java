package Recursion;
import java.util.*;
public class PrintNumbersFromNTo1 {
public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 reversePrint(n);
}
public static int reversePrint(int n) {
	if(n==1) {
		System.out.println(n);
		return 1;
	}
	System.out.println(n);
	return reversePrint(n-1);
}
}
