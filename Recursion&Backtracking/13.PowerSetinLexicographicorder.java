Problem: 

This article is about generating Power set in lexicographical order.

Examples :

Input : abc
Output : a ab abc ac b bc c

Solution:

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList < String > al = printLexicographicallySubsequences(str);
        Collections.sort(al);
        // System.out.println(al);
        for(int i=1;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }

    public static ArrayList<String> printLexicographicallySubsequences(String str) {
        if (str.length() == 0) {
            ArrayList < String > temp = new ArrayList < > ();
            temp.add("");
            return temp;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        ArrayList < String > ans = new ArrayList < > ();
        ArrayList < String > ques1 = printLexicographicallySubsequences(roq);
        for (String val: ques1) {
            ans.add(val);
        }
        ArrayList < String > ques2 = printLexicographicallySubsequences(roq);
        for (String val: ques2) {
            ans.add(ch+val);
        }
        return ans;
    }
}