Problem: "https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0#ExpectOP"

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
	     GFG.al=new ArrayList<String>();
	     printPermutations(str,"");
	     Collections.sort(al);
	     for(int i=0;i<al.size();i++){
	         System.out.print(al.get(i)+" ");
	     }
	     System.out.println();
	 }
	 }
	 
	 static ArrayList<String> al;
	 public static void printPermutations(String str,String asf){
	     if(str.length()==0){
	       //  System.out.print(asf+" ");
	       al.add(asf);
	         return;
	     }
	     for(int i=0;i<str.length();i++){
	         char ch=str.charAt(i);
	         String roq=str.substring(0,i)+str.substring(i+1,str.length());
	         printPermutations(roq,asf+ch);
	     }
	 }
}