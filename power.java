import java.util.*;
public class power {
    void pow(int a, int b){
        int mul=1;
        for(int i=1;i<=b;i++){
            mul=mul*a;
        }
        System.out.println(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        power p= new power();
        p.pow(a,b);
    }
}
