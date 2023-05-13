import java.util.*;
public class richest_man{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int sum=0;
        int max=0;
        int arr[][]= new int[m][n];
        //Inputing the array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //finding the sum;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum= sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}