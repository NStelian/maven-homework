package ro.itschool.mvnbase.tema20.searching;

import java.util.Arrays;

public class RecursionLiniarSearch<T extends Comparable<T>> {
    public boolean search(T[] elems, T elem) {
        if (elems == null || elems.length == 0) {
            return false;
        } else if (elems[0].compareTo(elem)==0) {
            return true;
        } else {
            return search(Arrays.copyOfRange(elems, 1, elems.length), elem);
        }
    }
}
