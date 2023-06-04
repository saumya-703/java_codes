import java.util.*;
public class ramson {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ransomNote=sc.nextLine();
        String magazine=sc.nextLine();
        String str1="";
        String str2="";
        char ch[]=ransomNote.toCharArray();
        char ch2[]=magazine.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        for(int i=0;i<ch.length;i++){
            str1=str1+ch[i];
        }
        for(int i=0;i<ch2.length;i++){
            str2=str2+ch2[i];
        }
        boolean val= str2.contains(str1);
        return val;
    }
}
