import java.util.*;
public class string {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element with 4 characters: ");
        String str1= sc.nextLine();
        int points=0;
        String c="";
        if(str1.length()!=4){
            System.out.println("Invalid input");
        }
        String str= "RGYB";
        String str2= str1.toUpperCase();

        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            for(int j=0;j<str2.length();j++){
             char ch2= str2.charAt(j);      
             if(i==j && ch==ch2){
                points = points+2;
             }
             else if(ch==ch2){
                points = points+1;
             }
             else{
                points=points+0;
             }
            }
        }
        System.out.print(points);
    }
}
