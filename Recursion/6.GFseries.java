Problem:  "https://practice.geeksforgeeks.org/problems/gf-series/0"

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
	     printGFseries(n,0,new long[n]);
	     System.out.println();
	 }
	 }
	 
	 public static void printGFseries(int n,int idx,long[] arr){
	     if(idx==n){
	         return;
	     }
	     if(idx==0){
	         arr[idx]=0;
	         System.out.print(arr[idx]+" ");
	         printGFseries(n,idx+1,arr);
	     }else if(idx==1){
	         arr[idx]=1;
	         System.out.print(arr[idx]+" ");
	         printGFseries(n,idx+1,arr);
	     }else{
	         arr[idx]=(arr[idx-2]*arr[idx-2])-arr[idx-1];
	         System.out.print(arr[idx]+" ");
	         printGFseries(n,idx+1,arr);
	     }
	 }
}


//GFG EDITORIAL:
long long gf(int n)
{
    if(n==1)
    return 0;
    if(n==2)
    return 1;
    else return gf(n-2)*gf(n-2)-gf(n-1);
}