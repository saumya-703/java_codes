import java.util.*;
public class Stocks {
    public static int maximum_profit(int arr[], int n){
        int mid= n/2;
        int min=arr[0];
        for(int i=0;i<mid;i++){//buy stock at minimum rate
            if(min>arr[i]){
                min=arr[i];
            }
        }
        int max=arr[mid];
        for(int i=mid;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        if(max-min>0){
            return (max-min);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maximum_profit(arr,n));
    }
}
