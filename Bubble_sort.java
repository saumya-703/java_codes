import java.util.*;
public class Bubble_sort{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n=sc.nextInt();
        int temp=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the the element at "+i);
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else{
                    continue;
                }
            }
        }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        System.out.print(arr[i]+" ");
        System.out.print(arr[i]+" ");
        System.out.print(arr[i]+" ");
        System.out.print(arr[i]+" ");
        System.out.print(arr[i]+" ");
        System.out.print(arr[i]+" ");
    }
    }
}