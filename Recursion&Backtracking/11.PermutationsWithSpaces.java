Problem: "https://practice.geeksforgeeks.org/problems/permutation-with-spaces/0"

Solution:


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner scn=new Scanner(System.in);
	 int n=scn.nextInt();
	 while(n-->0){
	     String str=scn.next();
        //  System.out.print(str);
	     printPermutationWithSpaces(str,"");
	     System.out.println();
	 }
	 }
	 
	 public static void printPermutationWithSpaces(String str,String asf){
	     if(str.length()==1){
	         System.out.print("("+asf+str.charAt(0)+")");
	         return;
	     }
	     
	     
	     if(str.length()>1){
         char ch=str.charAt(0);
         String roq=str.substring(1);
         printPermutationWithSpaces(roq,asf+ch+" ");
         printPermutationWithSpaces(roq,asf+ch);
	     }
	 }
}