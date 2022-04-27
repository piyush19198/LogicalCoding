import java.io.*;
import java.util.Scanner;

public class CaesarCipher {
    public static String simpleCipher(String normalText, int k) {

        StringBuilder cipherText = new StringBuilder();
        for(int i = 0; i< normalText.length();i++){
            if(k>=0){
                if(Character.isUpperCase(normalText.charAt(i))){
                    int rotate = normalText.charAt(i) - 'A' - k;
                    if (rotate < 0) {
                        rotate = rotate + 26;
                    }
                    cipherText.append((char)('A'+( rotate % 26)) );
                }
                else{
                    cipherText.append(normalText.charAt(i));
                }
            }
        }
        return cipherText.toString();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String normalText = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(simpleCipher(normalText, k));
    }
}