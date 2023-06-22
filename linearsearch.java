import java.util.*;
public class linearsearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter a array:");
        for (int i = 0; i < 5; i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched:");
        int n=sc.nextInt();
        int flag=0;
        for (int i = 0; i < 5; i++) {
            if(arr[i]==n)
            {
                flag++;
                System.out.println(i);
            }
           
            
        }
        if(flag==0){

            System.out.println("-1");
        }

        

    }

        
        
    }

