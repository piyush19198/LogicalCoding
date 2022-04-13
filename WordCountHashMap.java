import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//to count the number of words in a string using HashMap
public class WordCountHashMap {
    
    public static Map countWords(String str){
        Map<String, Integer> hashMap = new HashMap<>();
        
        String[] words = str.split(" ");
        for (String word : words) {
            Integer integer = hashMap.get(word);
            
            if(integer == null)
                hashMap.put(word, 1);
            else 
                hashMap.put(word, integer + 1);                    
        }
        return hashMap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to count words: ");
        String str = sc.nextLine();
        System.out.println(countWords(str));
    }
}