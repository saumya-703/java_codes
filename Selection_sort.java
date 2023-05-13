import java.util.*;
public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n=sc.nextInt();
        int temp=0;
        int tem=0;
        int min=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the the element at "+i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            min=i;
            for(int j =i+1; j<n;j++){
                min=i;
                if(arr[min]>arr[j]){
                    min=j;
                    System.out.println(arr[min]);
                }
            }
            temp= arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
