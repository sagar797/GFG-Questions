Problem: "https://www.geeksforgeeks.org/print-all-combinations-of-balanced-parentheses/"

Given n pairs of parentheses, write a function to generate and return all combinations of well-formed parentheses. That is, you need to generate all possible valid set of parenthesis that can be formed with given number of pairs.
Note : You need to return all parenthesis. No need to print.
Input format :
Integer n
Output format :
All possible valid parenthesis
Constraints :
1 <= n <= 10
Sample Input :
3
Sample Output :
((()))
(()())
(())()
()(())
()()()


Solution:

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        // printParanthesisInOrder(n,n,"");
        ArrayList<String> ans=printParanthesisInOrderString(n,n);
        // for(int i=0;i<ans.size();i++){
        //     System.out.println(ans.get(i));
        // }
        String[] ansInString=new String[ans.size()];
        for(int i=0;i<ansInString.length;i++){
            ansInString[i]=ans.get(i);
        }
        for(int i=0;i<ansInString.length;i++){
            System.out.println(ansInString[i]);
        }
    }
    
    public static void printParanthesisInOrder(int lp,int rp,String asf){
        if(lp<0||rp<0){
            return;
        }
        if(lp==0&&rp==0){
            System.out.println(asf);
            return;
        }
        if(lp<=rp){
            printParanthesisInOrder(lp-1,rp,asf+"(");
            printParanthesisInOrder(lp,rp-1,asf+")");
        }
    }
    public static ArrayList<String> printParanthesisInOrderString(int lp,int rp){
        // if(lp<0||rp<0){
        //     ArrayList<String> temp=new ArrayList<>();    //This Base Condition is not 
        //     temp.add("");                                //not suitable as it will go to
        //     return temp;                                 //-ve index and return new al in
        // }                                                //which val can be added ie here"("    
        if(lp==0&&rp==0){                                   //or ")" so use precheck method in al        
            ArrayList<String> temp=new ArrayList<>();
            temp.add("");
            return temp;
        }
        
        ArrayList<String> ans=new ArrayList<>();
        if(lp<=rp){
            ArrayList<String> leftParanthesis=new ArrayList<>();
            ArrayList<String> rightParenthesis=new ArrayList<>();
            if(lp-1>=0){leftParanthesis=printParanthesisInOrderString(lp-1,rp);}
            if(rp-1>=0){rightParenthesis=printParanthesisInOrderString(lp,rp-1);}
            for(String val:leftParanthesis){
                ans.add("("+val);
            }
            for(String val:rightParenthesis){
                ans.add(")"+val);
            }
        }
        return ans;
    }
}