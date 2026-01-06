package recursion;
import java.util.*;
class Solution{
    public int fib(int n)
    {
        if(n<=1)
            return n;

        return fib(n-1)+fib(n-2);
    }
}
public class fibonacci {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in) ;
       Solution s=new Solution();
       System.out.print("Enter a number: ");
       int n=sc.nextInt();
       System.out.println("The result is: "+ s.fib(n));
       sc.close();
    }
}
