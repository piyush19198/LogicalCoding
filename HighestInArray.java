public class HighestInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 19, 7, 8, 9, 10 };
        int highest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= highest) {
                highest = arr[i];
            }
        }
        System.out.println(highest);
    }
}
