package ro.itschool.mvnbase.tema20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 1, 4, 2};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        System.out.println(Arrays.toString(bubbleSort.sort(array)));

        String[] array2 = new String[]{"c","a","b"};
        BubbleSort<String> bubbleSort2 = new BubbleSort<>();
        System.out.println(Arrays.toString(bubbleSort2.sort(array2)));
    }
}
