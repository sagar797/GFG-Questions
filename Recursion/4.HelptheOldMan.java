Problem: "https://practice.geeksforgeeks.org/problems/help-the-old-man/0"

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
	         int number=scn.nextInt();
	         GFG.ans=0;
	         toh(disks,1,3,2,number);
	     }
	 }
	 
	 static int ans; 
	 public static void toh(int disks,int src,int dest,int helper,int number){
        if (disks == 0) 
        { 
            return; 
        } 
        toh(disks-1, src,helper,dest,number);
        ans++;
        if(ans==number){
            System.out.println(src+" "+dest);
        }
        toh(disks-1, helper, dest, src,number); 
	 }
}