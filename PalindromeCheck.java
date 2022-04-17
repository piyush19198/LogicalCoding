import java.util.Scanner;
import java.util.concurrent.CancellationException;

// Write a Java Program to find whether a string or number is palindrome or not.
public class PalindromeCheck {
    public static String checkPalindrome(String org) {
        String rev = "";
        for (int i = org.length() - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);
        }
        if (org.equals(rev)) {
            return "It is a Palindrome";
        } else
            return "Not a palindrome";
    }
    public static void main(String[] args) {
        System.out.println("Enter String to check if it is Palindrome: ");
        Scanner sc = new Scanner(System.in);
        String org = sc.nextLine();
        System.out.println(checkPalindrome(org));
    }
}
