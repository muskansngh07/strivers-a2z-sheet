package recursion;
import java.util.*;
class Solution{
    public void name(int i, int n, String s){
        if(i>n)
            return;
        System.out.println(s);
        name(i+1,n,s);
    }
}
public class printName {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Solution sn=new Solution();
        System.out.print("Enter the number of times you want to print the name: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name: ");
        String s=sc.nextLine();
        sn.name(1,n,s);
        sc.close();
    }
}
