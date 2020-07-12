Problem: "https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle/0"

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
	     int k=scn.nextInt();
	     System.out.println(gameOfDeath(n,k)+1);
	 }
	 }
	 
	 //Joesphus Problem:
	 public static int gameOfDeath(int n,int k){
	     if(n==1){
	         return 0;
	     }
	     return (gameOfDeath(n-1,k)+k)%n;
	 }
}