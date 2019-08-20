package ro.itschool.mvnbase.tema20.sorting;

public class SelectionSort<T extends Comparable<T>> {
    public T[] sort(T[] elems) {
        if (elems == null) {
            return null;
        }

        for (int i = 0; i < elems.length; i++) {
            int minPos = findMinPos(elems, i);
            swap(elems, i, minPos);
        }
        return elems;
    }

    private int findMinPos(T[] elems, int start) {
        int pos = start;
        for (int i = start; i < elems.length; i++) {
            if (elems[i].compareTo(elems[pos])<0) {
                pos = i;
            }
        }
        return pos;
    }

    private void swap(T[] elems, int first, int second) {
        T aux = elems[first];
        elems[first] = elems[second];
        elems[second] = aux;
    }
}
