import java.util.Scanner;

//to swap two numbers with using the third variable
public class SwapWOTemp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int first = sc.nextInt();       //5
        System.out.println("Enter second Number: ");
        int second = sc.nextInt();      //10
        
        first = first + second;         //a = 15
        second = first - second;        //b = 5         second swapped
        first = first - second;         //a = 10        first swapped

        System.out.println("First Number aftrer swap = "+first);
        System.out.println("Second Number aftrer swap = "+second);
    }
}