import java.util.Scanner;

//to reverse a string without using String inbuilt function.
public class ReverseString {
    public static String revStr(String str) {
        String revStr = "";
        for (int i = str.length(); i > 0; --i) {
            revStr = revStr + (str.charAt(i - 1));
        }
        return revStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to be reversed: ");
        String str = sc.nextLine();
        System.out.println("Reversed String is: ");
        System.out.println(revStr(str));
    }
}