import java.util.*;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=((n-i)*2);k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int m=n;m>=1;m--)
        {
            for(int o=1;o<=m;o++)
            {
                System.out.print("* ");
            }
            for(int p=0;p<(n-m)*2;p++)
            {
                System.out.print("  ");
            }
            for(int q=m;q>=1;q--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
