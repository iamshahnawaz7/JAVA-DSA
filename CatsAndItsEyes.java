package Recursion;
import java.util.*;
/**
 * CatsAndItsEyes
 */
public class CatsAndItsEyes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of cats you want to check legs off");
        int n=sc.nextInt();
        countEyes(n);
    }

    public static void countEyes(int m){
        System.out.println(m*2);
    }
}