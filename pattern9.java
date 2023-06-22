import java.util.*;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0&&j%2!=0)
                    count=0;
                else if(i%2!=0&&j%2==0)
                    count=0;
                else
                    count=1;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
