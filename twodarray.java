import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=sc.nextInt();
        System.out.println("Enter columns");
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter array elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number to be searched:");
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==n)
                {
                    System.out.println("Number present at index:"+" "+i+" "+j);
                    flag++;

                }
                
            }
            
        }
        if(flag==0)
        {
            System.out.println("Number not found:");
        }
    }
}