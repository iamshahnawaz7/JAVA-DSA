package Exam;
import java.util.*;
/**
 * ReverseAStringUsingRecursion
 */
public class ReverseAStringUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the string you want to reverse");
    String s=sc.nextLine();
    reverse(s);
    }

public static void reverse(String s){
    String str="";
    int n=s.length();
    if(s.length()==0){
        return; 
    }
    str=s.substring(1);
    reverse(str);
    System.out.print(s.charAt(0));
}
}