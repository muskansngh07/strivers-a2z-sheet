package basic_maths;
import java.util.*;
class Solution{
    public boolean isArmstrong(int x)
    {
        int digits=0;
        int temp=x;
        while(x!=0)
        {
            digits++;
            x/=10;
        }
        int temp1=temp;
        int sum=0;
        while(temp!=0)
        {
            int a=temp%10;
            sum=sum+(int)Math.pow(a,digits);
            temp/=10;
        }
        return temp1==sum;
    }
}
public class armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(s.isArmstrong(num))
        {
            System.out.println(num+" is an armstrong number.");
        }
        else{
            System.out.println(num+" is not an armstrong number.");
        }
        sc.close();
    }
}
