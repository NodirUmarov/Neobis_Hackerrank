import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num % 2 != 0){
            System.out.println("Weird");
        }
        else if(num % 2 == 0){
            if(num > 1 && num < 6){
                System.out.println("Not Weird");
            }
            else if(num >= 6 && num <= 20){
                System.out.println("Weird");
            }
            else if(num > 20){
                System.out.println("Not Weird");
            }
        }
    }
}