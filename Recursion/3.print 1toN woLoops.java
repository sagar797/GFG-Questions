Problem:  "https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops/0"

Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner scn=new Scanner(System.in);
	 int t=scn.nextInt();
	 while(t-->0){
	     int n=scn.nextInt();
	     printTillN(n);
	     System.out.println();
	 }
	 }
	 
	 public static void printTillN(int n){
	     if(n==0){
	         return;
	     }
	     printTillN(n-1);
	     System.out.print(n+" ");
	 }
}