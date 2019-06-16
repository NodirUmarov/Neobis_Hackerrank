import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger bi1 = scan.nextBigInteger();
        boolean b1 = bi1.isProbablePrime(1);
        if(b1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
