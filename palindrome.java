import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int l=str.length();
        String rev="";

        for(int i=0;i<l;i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Palindromic String = "+rev);
    }
}
