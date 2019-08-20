package ro.itschool.mvnbase.tema20;

import ro.itschool.mvnbase.tema20.searching.BinarySearch;
import ro.itschool.mvnbase.tema20.searching.LinearSearch;
import ro.itschool.mvnbase.tema20.searching.RecursionLiniarSearch;
import ro.itschool.mvnbase.tema20.sorting.BubbleSort;
import ro.itschool.mvnbase.tema20.sorting.InsertSort;
import ro.itschool.mvnbase.tema20.sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 1, 4, 2};
        String[] array2 = new String[]{"c", "a", "b"};


        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        //System.out.println(Arrays.toString(bubbleSort.sort(array)));
        BubbleSort<String> bubbleSort2 = new BubbleSort<>();
        //System.out.println(Arrays.toString(bubbleSort2.sort(array2)));

        InsertSort<Integer> insertSort = new InsertSort<>();
        //System.out.println(Arrays.toString(insertSort.sort(array)));
        InsertSort<String> insertSort2 = new InsertSort<>();
        //System.out.println(Arrays.toString(insertSort2.sort(array2)));

        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        //System.out.println(Arrays.toString(selectionSort.sort(array)));
        SelectionSort selectionSort2 = new SelectionSort();
        //System.out.println(Arrays.toString(selectionSort2.sort(array2)));


        LinearSearch<Integer> linearSearch = new LinearSearch<>();
        //System.out.println(linearSearch.search(array,1));
        LinearSearch<String> linearSearch2 = new LinearSearch<>();
        //System.out.println(linearSearch2.search(array2,"a"));

        BinarySearch<Integer> binarySearch = new BinarySearch<>();
        //System.out.println(binarySearch.search(array,1));
        BinarySearch<String> binarySearch2 = new BinarySearch<>();
        //System.out.println(binarySearch2.search(array2,"a"));

        RecursionLiniarSearch<Integer> recursionLiniarSearch = new RecursionLiniarSearch<>();
        //System.out.println(recursionLiniarSearch.search(array, 1));
        RecursionLiniarSearch<String> recursionLiniarSearch2 = new RecursionLiniarSearch<>();
        //System.out.println(recursionLiniarSearch2.search(array2, "a"));
    }
}
