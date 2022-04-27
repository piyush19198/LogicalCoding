public class PrimePrint {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                count++;
                System.out.println(num);
            }
        }
        System.out.println("count is " +count);
    }
}
