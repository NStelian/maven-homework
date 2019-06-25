package ro.itschool.mvnbase.Tema6;

public class ArrayConcat {
    public int[] concatenate(int[] array1, int[] array2) {
        int n = array1.length + array2.length;
        int[] array = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array[i + array1.length] = array2[i];
        }
        return array;
    }
}
