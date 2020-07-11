Problem: "https://practice.geeksforgeeks.org/problems/subset-sums/0"

Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	 Scanner scn=new Scanner(System.in);
	 int t=scn.nextInt();
	 while(t-->0){
	     int n=scn.nextInt();
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++){
	         arr[i]=scn.nextInt();
	     }
	     GFG.al=new ArrayList<Integer>();
	     printAllIncreasingSubsets(arr,0,0);
	     Collections.sort(al);
    	   for(int i=0;i<al.size();i++){
    	       System.out.print(al.get(i)+" ");
    	   }
	     System.out.println();
	 }
	}
	
	static ArrayList<Integer> al;
	public static void printAllIncreasingSubsets(int []arr,int idx,int sum){
	    if(idx==arr.length){
    	   al.add(sum);
	       return;
	    }
	    printAllIncreasingSubsets(arr,idx+1,sum);
	    printAllIncreasingSubsets(arr,idx+1,sum+arr[idx]);
	}
}