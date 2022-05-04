import java.util.Scanner;

public class MinWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        String[] strArr = inputStr.split(",");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        int[] firstArray = new int[intArr.length / 2];
        int[] secondArray = new int[intArr.length / 2];
 
        for (int i = 0; i < intArr.length; i++)
        {
            if (i < firstArray.length) {
                firstArray[i] = intArr[i];
            } else {
                secondArray[i - firstArray.length] = intArr[i];
            }
        }
        int max = 0;
        for (int j = 0; j < intArr.length / 2; j++) {
            if(firstArray[j]<secondArray[j]){
                if (firstArray[j] + secondArray[j] > max) {
                    max = firstArray[j] + secondArray[j];
                }
            }
        }
        System.out.println(max);
    }
}
