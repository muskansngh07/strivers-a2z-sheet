package basic_maths;
import java.util.*;
public class countDigits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        System.out.println("The number of digits in "+temp+" is: "+count);
        sc.close();
    }
}
