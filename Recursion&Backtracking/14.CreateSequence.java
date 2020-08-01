Problem: 
Given an integer n, you need to print all numbers less than n which are having digits only 2 or 5 or both.
Print every number in new line. Order of numbers doesn't matter.
Input format :
Integer n
Output format :
Required numbers in different lines
Input :
10
Output :
2
5 

Solution:
public class solution {
	
	public static void printSequence(int range){
        printHelper(range-1);
	}
    public static void printHelper(int n){
        if(n==1){
            return;
        }
        printHelper(n-1);
        
        int temp=n;
        // if(temp%10!=2||temp%10!=5){
        //     return;
        // }
        while(temp>0){
	         int d=temp%10;
              if(d!=2 && d!=5){
              return;
            }
            temp=temp/10;
        }
        System.out.println(n);
        //System.out.print("callling");
    }
}