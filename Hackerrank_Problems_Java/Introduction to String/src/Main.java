import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B=sc.next();
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        int length = A.length() + B.length();
        System.out.println(length);
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(A + " " + B);

    }
}



