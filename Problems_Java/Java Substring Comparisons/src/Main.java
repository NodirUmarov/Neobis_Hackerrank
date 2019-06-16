import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        substring(s);
        int num = scan.nextInt();
        comparison(null, num);
        System.out.println();
    }

    public static String[] substring(String sSubstring) {
        String[] setOfSubstrings = new String[sSubstring.length()];
        for (int i = 0; i <= sSubstring.length(); ++i) {
            setOfSubstrings[i] = sSubstring.substring(i, i + 3);
        }
        comparison(setOfSubstrings,0);
        return null;
    }

    public static String comparison(String[] setOfSubstrings, int num) {
        for (int i = 0; i <= setOfSubstrings.length; ++i) {
            for(int j = 0; j < num; ++j){

            }
        }
        return null;
    }
}