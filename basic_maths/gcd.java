package basic_maths;
import java.util.*;
class Solution
{
    public int GCD(int a,int b)
    {
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
}
class gcd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is "+s.GCD(a,b));
        sc.close();
    }
}
