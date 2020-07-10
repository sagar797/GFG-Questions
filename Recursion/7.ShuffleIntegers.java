Problem: "https://practice.geeksforgeeks.org/problems/shuffle-integers/0"

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
	     int arr[]=new int[n];
	     for(int i=0;i<arr.length;i++){
	         arr[i]=scn.nextInt();
	     }
	     shuffleIntegers(arr,0,arr.length/2);
	     System.out.println();
	 }
	 }
	 
	 public static void shuffleIntegers(int[] arr,int st,int mid){
	     if(mid==arr.length){
	         return;
	     }
	     if(st!=arr.length/2){
	        System.out.print(arr[st]+" ");
	     }
	     System.out.print(arr[mid]+" ");
	     shuffleIntegers(arr,st+1,mid+1);
	 }
}