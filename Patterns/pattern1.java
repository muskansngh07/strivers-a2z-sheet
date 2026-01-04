package Patterns;
class solution
{
    public void pattern(){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class pattern1 {
    public static void main(String[] args)
    {
        solution s=new solution();
        s.pattern();
    }
    
}
