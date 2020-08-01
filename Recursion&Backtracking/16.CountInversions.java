Problem: "https://www.geeksforgeeks.org/counting-inversions/"

Exaplanation: Inversion Count for an array indicates – how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
for example : [3 2 1] has no of inversion count = max(3) ie size of array , where as [1 2 3] has 0 no of inversion count. 

Solution:

First Solution:

Time complexity=O(n^2)
Space complexity=O(1)

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(solve(arr,n));
    }
    
	public static long solve(int[] A,int n){
        long ans=0;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[j]<A[i]){
                    ans++;
                }
            }
        }
        return ans;
	}
}


Second Solution: Enhanced Merge Sort
Time Complexity=O(n log n)
Space Compelxity=O(n)                                           PS: I didn't' write this Code taken from GFG... :)


import java.util.*;

public class Main {

    private static int mergeAndCount(int[] arr, int l, int m, int r) {

        // Left subarray 
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }

        // Fill from the rest of the left subarray 
        while (i < left.length)
            arr[k++] = left[i++];

        // Fill from the rest of the right subarray 
        while (j < right.length)
            arr[k++] = right[j++];

        return swaps;
    }

    // Merge sort function 
    private static int mergeSortAndCount(int[] arr, int l, int r) {

        // Keeps track of the inversion count at a 
        // particular node of the recursion tree 
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subarray count 
            // + right subarray count + merge count 

            // Left subarray count 
            count += mergeSortAndCount(arr, l, m);

            // Right subarray count 
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge count 
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(mergeSortAndCount(arr, 0, arr.length - 1));
    }

}
