package recursion;
import java.util.*;
class Solution{
    public void uptoN(int n)
    {
        if(n==0)
            return;
        uptoN(n-1);
        System.out.println(n);
    }
}
public class print1toN {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        s.uptoN(n);
        sc.close();
    }
}
