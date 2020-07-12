Problem:


Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level.
Example :

Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5] 

Explanation :
Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)


Solution: 


import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        result.add(al);
        printTriangle(arr);
        for(int i=result.size()-1;i>=0;i--){
            System.out.println(result.get(i));
        }
    }
    
    static ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    public static void printTriangle(int[] arr){
        if(arr.length==1){
            return;
        }
        ArrayList<Integer> al=new ArrayList<>();
        int[] res=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            int val=arr[i-1]+arr[i];
            al.add(val);
            res[i-1]=val;
        }
        result.add(al);
        printTriangle(res);
    }
}