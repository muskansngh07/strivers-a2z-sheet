package recursion;
import java.util.*;
class Solution{
    public int computeSum(int n)
    {
        if(n<=0)
            return 0;
        return n+computeSum(n-1);
    }
}
public class sum {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in) ;
       Solution s=new Solution();
       System.out.print("Enter a number: ");
       int n=sc.nextInt();
       System.out.println("The sum is: "+ s.computeSum(n));
       sc.close();
    }
}
