import java.util.*;
import java.lang.Math;
class sumofseries3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+(Math.pow(i,2));
        }
        System.out.println(sum);
    }
}
