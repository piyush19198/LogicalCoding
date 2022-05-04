import java.util.Scanner;

public class CocoTin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        int first = sum / 10;
        int firstcarry = sum % 10;
        
        int second = firstcarry / 7;
        int secondcarry = firstcarry % 7;

        int third = secondcarry / 5;
        int thirdcarry = secondcarry % 5;

        int forth = thirdcarry / 3;
        int forthcarry = thirdcarry % 3;

        int fifth = forthcarry / 1;
        int fifthcarry = forthcarry % 1;
        
        int ans = first + second + third + forth + fifth;
        System.out.println(ans);
    }
}
