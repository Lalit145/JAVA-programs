import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int[] arr=new int[n];
        System.out.println("Enter the number to be searched:");
        int k=sc.nextInt();
        for(i=0;i<n;i++);
        {
            arr[i]=sc.nextInt();

        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
