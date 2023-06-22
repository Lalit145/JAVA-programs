import java.util.*;
public class linearsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter a array");
        for (int i = 0; i < 4; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
