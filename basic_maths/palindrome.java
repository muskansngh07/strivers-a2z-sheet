package basic_maths;
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        if(x<0)
            return false;
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+x%10;
            x/=10;
        }
        return (num==rev);
    }
}
public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(s.isPalindrome(num))
            System.out.println(num+" is a palindromic number.");
        else
            System.out.println(num+" is not a palindromic number.");
        sc.close();
    }
}
