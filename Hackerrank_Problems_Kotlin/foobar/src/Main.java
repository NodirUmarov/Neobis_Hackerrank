import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        fooBar(scan.nextInt());

        System.exit(0);
    }

    public static void fooBar(int fooBar){
        if(fooBar % 2 != 0){
            System.out.println("bar " + fooBar);
        }
        else{
            System.out.println("foo " + fooBar);
        }
    }
}
