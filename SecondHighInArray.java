public class SecondHighInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 19, 17, 8, 9, 12 };
        int highest = 0;
        int secondHighest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
            if (arr[i] < highest && arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }
        System.out.println(secondHighest);
    }
}
