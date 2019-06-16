import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    String substring = s.substring(scan.nextInt(), scan.nextInt());
        System.out.println(substring);

    }
}
