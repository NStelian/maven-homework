package ro.itschool.mvnbase.tema20;

public class AnyType<T extends Comparable> {
    public T[] bubbleSort(T[] values) {
        if (values == null) {
            return null;
        }

        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i].compareTo(values[i + 1]) > 0) {
                    swap(values, i, i + 1);
                    sorted = false;
                }
            }
        } while (!sorted);

        return values;
    }

    private void swap(T[] elems, int first, int second) {
        T aux = elems[first];
        elems[first] = elems[second];
        elems[second] = aux;
    }

}
