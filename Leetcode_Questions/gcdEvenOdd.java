package Leetcode_Questions;
import java.util.*;
class Solution{
    public int GCD(int a,int b)
    {
        if(b==0)
                return a;
        return GCD(b,a%b);
    }
    public int sumOfEvenOdd(int n)
    {
        int even=n*(n+1);
        int odd=n*n;
        return GCD(odd,even);
    }
}
public class gcdEvenOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The GCD of even and odd sums is: "+s.sumOfEvenOdd(n));
        sc.close();
    }
}
