package basic_maths;
import java.util.*;
class Solution{
    public List<Integer> divisors(int n)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                ans.add(i);
        }
        return ans;
    }
}
public class allDivisors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        List<Integer>a=s.divisors(num);
        System.out.print("[");
        for(int i=0;i<a.size();i++)
        {
            if(i!=a.size()-1)
            {
                System.out.print(a.get(i)+",");
            }
            else
                System.out.print(a.get(i));
        }
        System.out.print("]");
        sc.close();
    }
}
