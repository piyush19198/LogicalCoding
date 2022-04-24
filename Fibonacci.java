import java.util.Scanner;

// Write a Java Program for Fibonacci series.
public class Fibonacci {
    static int firstTerm = 0;
    static int secondTerm = 1;
    static int printTerm = 0;
    public static void fibonacciNonRecursion(int n) {
        System.out.println("Without recursion Fibonacci series upto " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void fibonacciRecursion(int n) {
        if (n > 0) {
            printTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = printTerm;
            System.out.print(", " + printTerm);
            fibonacciRecursion(n - 1);
        }      
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n(upto which you want fibonacci series to be printed)");
        int n = sc.nextInt();
        boolean choice = true;
        while (choice) {
            System.out.println("\nChoose method: \n1. Non recursive \n2. Recursive \n3. EXIT");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    fibonacciNonRecursion(n);
                    break;
                case 2:
                    System.out.print("With recursion Fibonacci series upto " + n + " terms:  \n0, 1");
                    fibonacciRecursion(n-2);
                    break;
                case 3:
                    choice = false;
                    break;
                default:
                    System.out.println("!!! PLEASE SELECT VALID CHOICE !!!");
                    break;
            }
        }
    }
}
