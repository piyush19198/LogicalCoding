import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void binarySearch(int arr[], int low , int high, int key){
        int mid = (low + high) / 2;
        int count = 0;
        while (low <= high) {
             if (key > arr[mid]) {
                count++;
                low = mid + 1;
            } else if (key == arr[mid]) {
                count++;
                System.out.println("Element is found at index : " + mid + " in " + count + " iterations");
                break;
            } else {
                count++;
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            count++;
            System.out.println("Element not found after " + count + " iterations");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        int n = arr.length;
        int high = n - 1;

        System.out.println("Array to search in "+ Arrays.toString(arr));
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();

        binarySearch(arr, 0, high, key);
    }
}