Question Link:   "https://practice.geeksforgeeks.org/problems/number-of-paths/0"

Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     while(t-->0){
	         int row=scn.nextInt();
	         int col=scn.nextInt();
	         System.out.println(numberOfPaths(0,0,row,col,0));
	     }
	 }
	 
	 public static int numberOfPaths(int r,int c,int row,int col,int count){
	     if(r==row-1||c==col-1){
	         return count+1;
	     }
	     int rPath=numberOfPaths(r,c+1,row,col,count);//right movement
	     int dPath=numberOfPaths(r+1,c,row,col,count);//down movement
	     return rPath+dPath;
	 }
}