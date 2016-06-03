import java.util.Arrays;

/**
 * Created by Vlad on 6/1/2016.
 */
public class BinarySearch {
        /*public static boolean contains(int[] arr, int item) {
            int index = Arrays.binarySearch(arr, item);
            return index >= 0;
        }*/

    int[] arr = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15 };
    public static void main(String[] args) {
        /*Arrays.sort(myArray);
          System.out.println(contains(myArray, 13));
          System.out.println(contains(myArray, 25));*/

    }

    public void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}
