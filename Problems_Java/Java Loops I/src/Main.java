import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int multiplicator = scan.nextInt();
        for(int i = 1; i <= 10; ++i ){
            System.out.println(multiplicator + " x " + i + " = " + multiplicator * i);
        }
    }
}
