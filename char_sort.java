import java.util.*;
public class char_sort{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char a[]={'a','l','f','d'};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}