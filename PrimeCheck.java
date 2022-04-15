import java.util.Scanner;

// Write a Java Program to find whether a number is prime or not
public class PrimeCheck {
    // public static String checkPrime(int num){
    //     if(num<=1)
    //         return num + " is not Prime";
    //     for(int itr = 2; itr < num; itr++){
    //         if(num % itr == 0)
    //         return num + " is not Prime";
    //     }
    //     return num + " is Prime";
    // }

    public static String checkPrime(int num) {
        if(num <=1)
            return num + " is not Prime";
        if(num<=3)
            return num + " is Prime";
        if(num % 2 == 0 || num % 3 == 0)
            return num + " is not Prime";
        for (int itr = 5; itr * itr <= num; itr = itr + 6) {
            if (num % 1 == 0 || num % (itr + 2) == 0)
                return num + " is not Prime";
        }
        return num + " is Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime: ");
        System.out.println(checkPrime(sc.nextInt()));
    }
}
