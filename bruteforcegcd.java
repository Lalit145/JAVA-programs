import java.util.*;
public class bruteforcegcd {
    public static void main(String[] args)
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=0;
        int min=0;
        if(a<b)
        {
            min=a;
        }
        else
        {
            min=b;
        }
        for(int i=2;i<=min;i++)
        {
            if(n%i==0)
            gcd=i;
        }
        
        System.out.println(gcd);
    }
}
