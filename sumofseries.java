import java.util.*;
class sumofseries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        int f=0;
        for(int i=1;i<=n;i++)
        {
            f=f+i;
            sum=sum+f;
        }
        System.out.println(sum);
        sc.close();
    }
}