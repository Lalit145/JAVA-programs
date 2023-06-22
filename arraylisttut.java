import java.util.ArrayList;
import java.util.*;
public class arraylisttut {
    public static void main(String[] args)
    {
    ArrayList<Integer>list=new ArrayList<>(5);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array list");
    for(int i=0;i<5;i++)
    {
        list.add(sc.nextInt());
    }
    // list.get(1);
    System.out.println(list.get(1));
    }
}
