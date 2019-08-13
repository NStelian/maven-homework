package ro.itschool.mvnbase.tema20;

public class InsertSort<T extends Comparable<T>> {
    public T[] sort(T[] elems) {
        if (elems == null) {
            return null;
        }
        for (int i = 1; i < elems.length; ++i) {
            T key = elems[i];
            int j = i - 1;

            while (j >= 0 && elems[j].compareTo(key) > 0) {
                elems[j + 1] = elems[j];
                j--;
            }
            elems[j + 1] = key;
        }
        return elems;
    }
}
