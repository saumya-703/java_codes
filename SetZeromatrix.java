import java.util.*;
public class SetZeromatrix {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of times you want to perform the operation: ");
        int size= sc.nextInt();
        for(int k=0;k<size;k++){
            System.out.println("Enter the size of the rows");
            int n = sc.nextInt();
            System.out.println("Enter the size of the columns");
            int m= sc.nextInt();
            int arr[][]= new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]= sc.nextInt();
                }
                System.out.println("");
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==0){

                        for(int x=0;x<n;x++){//Columm
                            int y=j;
                            arr[x][y]=0;
                        }

                        for(int y=0;y<m;y++){//Row
                            int x=i;
                            arr[x][y]=0;
                        }
                    }
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
        }

    }
}
