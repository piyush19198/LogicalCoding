import java.util.Arrays;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str = "Great responsibility";
        int count;
        char strarr[] = str.toCharArray();
        System.out.println("Duplicate characters in a given string: ");  
        for (int i = 0; i < strarr.length; i++) {
            count = 1;
            for (int j = i + 1; j < strarr.length; j++) {
                if (strarr[i] == strarr[j] && strarr[i] != ' ') {
                    count++;
                    strarr[j] = 0;
                }
            }
            if (count > 1 && strarr[i] != '0') {
                System.out.println(strarr[i]);
            }
        }
        System.out.println(Arrays.toString(strarr));
    }
}
