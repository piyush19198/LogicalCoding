public class ArmStringNumber {
    public static boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;
        int last = 0;
        int sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if(n==sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int num = 1000;
        for (int i = 0; i <= num; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
