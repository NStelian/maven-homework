package ro.itschool.mvnbase.tema20;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 4, 2};
        AnyType<Integer> anyType = new AnyType<>();
        System.out.println(anyType.bubbleSort(array));
    }
}
