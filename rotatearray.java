import java.util.*;

public class rotatearray {

    public void r_array(int arr[], int n, int k){
        int temp[]=new int[n];
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int i=n-1;i>=k;i--){
            arr[i]=arr[i-k];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        rotatearray r= new rotatearray();
        r.r_array(arr, n, k);
    }
}
