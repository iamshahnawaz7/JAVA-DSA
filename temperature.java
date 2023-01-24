package Exam;
import java.util.*;
public class temperature {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in degree celcius");
		int temp=sc.nextInt();
		double fahrenheit=(9*temp/5)+32;
		System.out.println("The temperature in Fahrenheit is "+fahrenheit);

	}

}
