package ro.itschool.mvnbase.tema12;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> first = List.of("unu", "doi", "trei");
        List<String> second = List.of("unu", "doi", "patru");

        ListOperations listOperations = new ListOperations();

        System.out.println(listOperations.compare(first, second));
        System.out.println(listOperations.intersect(first, second));
        System.out.println(listOperations.union(first, second));
        System.out.println(listOperations.subtract(first, second));
    }
}
