Problem:
Given an integer n, break it into smaller numbers such that their summation is equal to n. Print all such combinations in different lines.
Note : [1, 2, 1] and [1,1, 2] are same, so print the particular sequence with increasing order. Order of different combinations does not matter.
Input format :
Integer n
Output format :
Print all possible combinations in different lines
Constraints :
1 <= n <= 100
Input :
4
Output :
1 1 1 1
1 1 2
1 3
2 2
4


Solution:
First 2 Solution TLE;
Last Optimized AF;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // printBreakNumbersNto0(n, n, "");
        // printBreakNumbers0toN(n, n, 0, "");
        printCombination(n);
    }

    public static void printBreakNumbersNto0(int n, int ssf, String asf) {
        if (ssf == 0) {
            // for (int i = 1; i < asf.length(); i++) {
            //     if (asf.charAt(i - 1) > asf.charAt(i)) { //TLE
            //         return;
            //     }
            // }
            System.out.println(asf);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (ssf - i >= 0) {
                printBreakNumbersNto0(n - i, ssf - i, asf + i);
            }
        }
    }

    public static void printBreakNumbers0toN(int n, int ans, int ssf, String asf) {
        if (n == 0) {
            // for(int i=1;i<asf.length();i++){
            //     if(asf.charAt(i-1)>asf.charAt(i)){               //TLE
            //         return;
            //     }
            // }
            if (ssf == ans) {
                System.out.println(asf);
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (ssf + i <= ans) {
                printBreakNumbers0toN(n - i, ans, ssf + i, asf + i);
            }
        }
    }

    //CODING NINJAS PERU SOLUTION OPTIMIZED AF :D
    public static void printCombination(int num) {
        if (num < 0) {
            return;
        }
        if (num == 0) {
            System.out.println("0");
        }
        print(num, "", 1);
    }
    public static void print(int num, String output, int startFrom) {
        if (num == 0) {
            System.out.println(output);
            return;
        }
        if (num < 0) {
            return;
        }
        for (int i = startFrom; i <= num; i++) {
            if (output.length() == 0) {
                print(num - i, output + i, i);
            } else {
                print(num - i, output + " " + i, i);
            }
        }
    }
}