import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        String[] numbers = new String[tests];
        scan.nextLine();
        for(int i = 0; i < tests; ++i){
            numbers[i] = scan.nextLine();
        }

       for(int i = 0; i < numbers.length; ++i){
            for(int j = 0; j < numbers.length; ++j){
                BigDecimal a = new BigDecimal(numbers[i]);
                BigDecimal b = new BigDecimal(numbers[j]);
                BigDecimal max = a.max(b);
                numbers[i] = max.toString();
            }
        }
        for(int i = 0; i < numbers.length; ++i){
            System.out.println(numbers[i]);
        }
    }
}
