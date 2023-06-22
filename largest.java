import java.util.*;
class largest {
    
    public int largest(int arr[], int n)
    {
        Scanner sc=new Scanner(System.in);
        int largest=0;
        
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<arr[i+1])
            {
                largest=arr[i+1];
            }
            else
            {
                largest=arr[i];
            }
        }
        
        return largest;
    }
    
}