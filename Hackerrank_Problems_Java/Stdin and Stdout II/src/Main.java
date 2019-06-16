import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
	    Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double fracNum = scan.nextDouble();
        scan.nextLine();
        String string = scan.nextLine();
        System.out.println("String: " + string + "\n" + "Double: " + fracNum + "\n" + "Int: " + num);
    }
}
