public class BinarySearch {
    public static void binarySearch(int arr[], int low , int high, int key){
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index : " + mid);
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int high = n - 1;
        int key = 10;
        binarySearch(arr, 0, high, key);
    }
}