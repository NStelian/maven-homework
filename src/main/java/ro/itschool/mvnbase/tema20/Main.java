package ro.itschool.mvnbase.tema20;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 4, 2};
        BubbleSort<Integer> anyType = new BubbleSort<>();
        System.out.println(anyType.sort(array));
    }
}
