import java.io.*;
import java.util.Scanner;

public class CaesarCipher {
    public static String simpleCipher(String encrypted, int k) {

        StringBuilder cipherText = new StringBuilder();
        for(int i = 0; i< encrypted.length();i++){
            if(k>=0){
                if(Character.isUpperCase(encrypted.charAt(i))){
                    int rotate = encrypted.charAt(i) - 'A' - k;
                    if (rotate < 0) {
                        rotate = rotate + 26;
                    }
                    cipherText.append((char)('A'+( rotate % 26)) );
                }
                else{
                    cipherText.append(encrypted.charAt(i));
                }
            }
        }
        return cipherText.toString();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String encrypted = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(simpleCipher(encrypted, k));
    }
}