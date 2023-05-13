import java.util.*;
public class bitwise_xor{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]= new int[n-1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            temp[i]=arr[i]^arr[i+1];
        }

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}