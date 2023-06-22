import java.util.*;
public abstract class evendigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int digits=0;
        
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            while(arr[i]>0)
            {
                digits++;//counting digits
                arr[i]=arr[i]/10;//extracting digits
            }
            if(digits%2==0)//checking whether digits are even
            {
                System.out.println(i);//printing index
            }
            digits=0;
            
        }
    }
}
