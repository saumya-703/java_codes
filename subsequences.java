import java.util.*;
public class subsequences {
    public static void main(String[] args) {
        int arr[]= new int[4];
        int target=9;
        int c=0;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        for(int j=0;j<4;j++){
            int sum=0;
            sum=arr[0]+arr[j];
            if(sum<=target){
                c++;
            }
        }

    }

}
