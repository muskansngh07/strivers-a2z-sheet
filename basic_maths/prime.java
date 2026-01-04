package basic_maths;
import java.util.*;
class Solution{
    public boolean isPrime(int x)
    {
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
                count++;
        }
        return count==2;

    }
}
class prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(s.isPrime(num))
            System.out.println(num+" is a prime number.");
        else
            System.out.println(num+" is not a prime number.");
        sc.close();
    }
}
