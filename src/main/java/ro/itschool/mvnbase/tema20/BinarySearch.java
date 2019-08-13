package ro.itschool.mvnbase.tema20;

import java.util.Arrays;

public class BinarySearch<T extends Comparable<T>> {
    public boolean search(T[] elems, T elem) {
        if (elems == null || elems.length==0) {
            return false;
        }
        if (elems[elems.length / 2].compareTo(elem)==0) {
            return true;
        } else if (elems[elems.length / 2].compareTo(elem)<0) {
            return search(Arrays.copyOfRange(elems, elems.length / 2 + 1, elems.length), elem);
        } else {
            return search(Arrays.copyOfRange(elems, 0, elems.length / 2), elem);
        }
    }
}
