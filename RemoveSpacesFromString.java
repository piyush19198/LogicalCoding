//  Write a Java Program to remove all white spaces from a string with using replace().
public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "Piyush Ramdas Warke";
        
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                System.out.print(arr[i]);
            }
        }
    }
}
