package recursion;
import java.util.*;
class Solution{
    public void uptoN(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        uptoN(n-1);
    }
}
public class printNto1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        s.uptoN(n);
        sc.close();
    }
}
