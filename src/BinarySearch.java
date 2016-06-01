import java.util.Arrays;

/**
 * Created by Vlad on 6/1/2016.
 */
public class BinarySearch {
        public static boolean contains(int[] arr, int item) {
            int index = Arrays.binarySearch(arr, item);
            return index >= 0;
        }
        public static void main(String[] args) {
            int[] myArray = { 5, 2, 17, 13, 12, 19, 7, 3, 9, 15 };
            Arrays.sort(myArray);
            System.out.println(contains(myArray, 13));
            System.out.println(contains(myArray, 25));
        }
}
