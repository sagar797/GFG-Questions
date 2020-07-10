Probelm: "https://practice.geeksforgeeks.org/problems/tower-of-hanoi/0"

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
	         int disks=scn.nextInt();
	         GFG.ans=0;
	         toh(disks,1,3,2);
	         System.out.println(ans);
	     }
	 }
	 
	 static int ans; 
	 public static void toh(int disks,int src,int dest,int helper){
        if (disks == 0) 
        { 
            // System.out.println("move disk 1 from rod " + src + " to rod " + dest); 
            // ans++;
            return; 
        } 
        toh(disks-1, src,helper,dest);
        ans++;
        System.out.println("move disk " + disks + " from rod " +  src + " to rod " + dest); 
        toh(disks-1, helper, dest, src); 
	 }
}