Problem : "https://www.geeksforgeeks.org/edit-distance-dp-5/"

CodeZen:
Given two strings s and t of lengths m and n respectively, find the Edit Distance between the strings. Edit Distance of two strings is minimum number of steps required to make one string equal to other. In order to do so you can perform following three operations only :
1. Delete a character

2. Replace a character with another one

3. Insert a character
Note - Strings do not contain spaces
Input Format :
Line 1 : String s
Line 2 : String t
Output Format :
Line 1 : Edit Distance value
Constraints
1<= m,n <= 20
Sample Input 1 :
abc
dc
Sample Output 1 :
2


Solution:
// A Dynamic Programming based Java program to find minimum 
// number operations to convert str1 to str2 
import java.util.*;
class Main {
    static int min(int x, int y, int z) {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }

    static int editDistDP(String str1, String str2, int m, int n) {
        // Create a table to store results of subproblems 
        int dp[][] = new int[m + 1][n + 1];

        // Fill d[][] in bottom up manner 
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty, only option is to 
                // insert all characters of second string 
                if (i == 0)
                    dp[i][j] = j; // Min. operations = j 

                // If second string is empty, only option is to 
                // remove all characters of second string 
                else if (j == 0)
                    dp[i][j] = i; // Min. operations = i 

                // If last characters are same, ignore last char 
                // and recur for remaining string 
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                // If the last character is different, consider all 
                // possibilities and find the minimum 
                else
                    dp[i][j] = 1 + min(dp[i][j - 1], // Insert 
                        dp[i - 1][j], // Remove 
                        dp[i - 1][j - 1]); // Replace 
            }
        }

        return dp[m][n];
    }

    public static void main(String args[]) {
        String str1 = "sunday";
        String str2 = "saturday";
        System.out.println(editDistDP(str1, str2, str1.length(), str2.length()));
    }
 }