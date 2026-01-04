/*  Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned). */

package basic_maths;
import java.util.*;
class Solution{
    public int reverse(int x){
        long reversed=0;
        while(x!=0)
        {
            int num=x%10;
            reversed=reversed*10+num;
            x/=10;
        }
        if(reversed>Integer.MAX_VALUE ||reversed<Integer.MIN_VALUE)
            return 0;
        return (int)reversed;
    }
}
class reverseNumber {
    public static void main(String args[])
    {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("The reverse of "+num+" is: "+s.reverse(num));
        sc.close();
    }
}
