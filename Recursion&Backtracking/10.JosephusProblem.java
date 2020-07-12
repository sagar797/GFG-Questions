Problem: "https://practice.geeksforgeeks.org/problems/josephus-problem/1"

Solution:


class Josephus
{
    public static int josephus(int n, int k)
    {
        return giveAns(n,k)+1;
    }

    public static int giveAns(int n,int k){
    if(n==1){
        return 0;
    }
    return (giveAns(n-1,k)+k)%n; 
    }
}
