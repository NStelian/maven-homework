package ro.itschool.mvnbase.tema20.searching;

public class LinearSearch<T extends Comparable<T>> {
    public boolean search(T[] elems, T elem) {
        if(elems==null){
            return false;
        }

        for (int i=0;i<elems.length;i++){
            if(elems[i].compareTo(elem)==0){
                return true;
            }
        }
        return false;
    }
}
