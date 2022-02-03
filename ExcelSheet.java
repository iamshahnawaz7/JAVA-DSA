package Quesba;

public class ExcelSheet {
	class Solution {
	    public String excelColumn(int n){
	       String str="ZABCDEFGHIJKLMNOPQRSTUVWXY";
	       String abc="";
	       
	       while(n>0){
	           int i=n%26;
	           abc=str.charAt(i)+abc;
	           n=n/26;
	           if(i==0){
	               n--;
	           }
	       }
	       return abc;
	    }
	}
}
