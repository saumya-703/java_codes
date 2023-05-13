import java.util.*;
public class Pascal {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int val=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				val = fact(i)/(fact(j)*fact(i-j));
				System.out.print(val+" ");
			}
			System.out.println("");
		}
    }

    public static int fact(int a){
		int f=1;
		for(int i=1;i<=a;i++){
			f=f*i;
		}
		return f;
    }
}
