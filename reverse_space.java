import java.util.*;
public class reverse_space {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        str=str+" ";
        int l= str.length();
        String rev="";
        String new_str=" ";
        for(int i=0;i<l;i++){
            char ch= str.charAt(i);
            if(ch!=' '){
                rev= ch+rev;
            }
            else{
                new_str= new_str+ " "+rev;
                rev="";
            }
        }
        System.out.println(new_str.trim());
    }
}
