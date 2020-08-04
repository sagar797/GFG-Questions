Problem: "https://www.geeksforgeeks.org/length-of-longest-connected-1s-in-a-binary-grid/"

Consider a matrix with rows and columns, where each cell contains either a 0 or a 1 and any cell containing a 1 is called a filled cell. Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally; in other words, cell [i,j] is connected to cells [i+1,j],[i,j+1] ,[i,j-1] ,[i-1,j] ,[i+1,j+1] ,[i-1,j-1] ,[i-1,j+1] ,[i+1,j-1], provided that the location exists in the matrix for that .
If one or more filled cells are also connected, they form a region. Note that each cell in a region is connected to zero or more cells in the region but is not necessarily directly connected to all the other cells in the region.
Given a n*m matrix, find and print the number of cells in the largest region in the matrix. Note that there may be more than one region in the matrix.
Input format :
Line 1 : Two space separated integers n (No. of rows) and m (No. of columns)
Next n lines : m elements of each row (separated by space).
Output format :
Maximum length
Constraints :
1 <= n, m <= 100
Sample Input :                                                          
3 3                                                                      
1 1 1
0 0 1
0 0 0                                                                     
Sample Output :
4

//MADE BY ME  
TestCase: Input
7 6
0 0 0 0 0 0 0                                                                        
0 1 0 1 0 0 0 
0 1 0 1 0 0 0  
0 1 0 1 0 1 0  
0 1 1 1 1 1 0  
0 0 0 1 0 0 0        
TestCase :Output 
9 

Solution:

//WRONG CODE
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        boolean visited[][]=new boolean[row][col];
        connectedOnes(matrix, 0, 0, 0,visited);
        System.out.println(answ);
    }


    static int answ=0;
    public static void connectedOnes(int[][] matrix, int r, int c, int ans,boolean[][] visited) {
        if (r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length||visited[r][c]==true||matrix[r][c]==0) {
            return;
        }else{
            ans++;
            if(ans>answ){
                answ++;
            }
        }
        
        visited[r][c]=true;
        connectedOnes(matrix, r + 1, c, ans,visited);
        connectedOnes(matrix, r, c + 1, ans,visited);
        connectedOnes(matrix, r, c - 1, ans,visited);
        connectedOnes(matrix, r - 1, c, ans,visited);
        connectedOnes(matrix, r + 1, c + 1, ans,visited);
        connectedOnes(matrix, r - 1, c - 1, ans,visited);
        connectedOnes(matrix, r - 1, c + 1, ans,visited);
        connectedOnes(matrix, r + 1, c - 1, ans,visited);
        visited[r][c]=false;
    }
}