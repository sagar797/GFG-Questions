Problem:
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz

Solution:
public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
        String str= helper(s,"");
        return str;
	}
    
    public static String helper(String str,String asf){
        if(str.length()==1){
            return asf+str.charAt(0);
        }
        char ch=str.charAt(0);
        String ques=str.substring(1);
        return helper(ques,ch==ques.charAt(0)?asf:asf+ch);
    }

}