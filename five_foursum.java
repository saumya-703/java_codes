import java.util.*;

public class five_foursum {

    public static void main(String[] args) {
        int[] sumarr = new int[5];
        Scanner sc= new Scanner(System.in);
        int[] numbers = new int[5];
        
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int sum = calculateSum(numbers, i);
            sumarr[i]=sum;
        }
        for(int i=0;i<5;i++){
            System.out.println(sumarr[i]);
        }
    }

    public static int calculateSum(int[] numbers, int excludedIndex) {

        int c=0;
        if (excludedIndex < 0 || excludedIndex >= numbers.length) {
            throw new IllegalArgumentException("Invalid excluded index");
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != excludedIndex) {
                sum += numbers[i];
            }
        }
        return sum;
    }

}





