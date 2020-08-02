Problem:  "https://www.geeksforgeeks.org/generate-all-numbers-up-to-n-in-lexicographical-order/"

CodeZen Question:
Given a number n, print numbers from 1 to n in dictionary(lexicographical) order.
Sample Input
20
Sample Output
1
10
11
12
13
14
15
16
17
18
19
2
20
3
4
5
6
7
8
9

Solution:               ________________________VECTOR SOLUTION IN JAVA________________________


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        lexicographicalOrder(n);
    }

    public static void lexicographicalOrder(int n) {
        Vector s = new Vector();
        for (int i = 1; i <= n; i++) {
            s.add(i + "");
        }
        Collections.sort(s);
        for (int i = 0; i < n; i++) {
            System.out.println(s.get(i));
        }
    }
}