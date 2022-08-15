package PracticeQuestion;
import java.util.*;
public class CountTotalSetBits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("abc");
		int count=0;
		for(int i=1;i<=n;i++) {
			while(i!=1) {
				if((i%2)==1) {
					count++;
				}
			}
			count++;
		}
		System.out.println(count);
		System.out.println("ac");

	}

}
