import java.util.*;
public class arrayl{
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of times: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the index position: ");
            int in=sc.nextInt();
            System.out.print("Enter the element at the postion: ");
            int e=sc.nextInt();
            a.add(in,e);
        }
        System.out.println(a);
    }
}
