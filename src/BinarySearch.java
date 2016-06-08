import java.util.Arrays;

/**
 * Created by Vlad on 6/1/2016.
 */
public class BinarySearch {
    //int[] array = new int[]{1, 5, 6, 3, 4, 2, 7, 9, 8, 0};

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        search.bubbleSort(new int[]{1, 5, 6, 3, 4, 2, 7, 9, 8, 0});
        System.out.println(search);

    }

    public void bubbleSort(int[] array){
        int temporaryValue;
        boolean swap = true;
        int a = 0;
        while (swap) {
            swap = false;
            a++;
            for (int i = 0; i < array.length - a; i++) {
                if (array[i] > array[i + 1]) {
                    temporaryValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temporaryValue;
                    swap = true;
                }
            }
        }
    }
}
