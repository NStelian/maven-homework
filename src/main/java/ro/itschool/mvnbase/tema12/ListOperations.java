package ro.itschool.mvnbase.tema12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOperations {
    public boolean compare(List<String> first, List<String> second) {
        return first.equals(second);
    }

    public List<String> intersect(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        for (String word : second) {
            if (first.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> union(List<String> first, List<String> second) {
        Set<String> result = new HashSet<>(first);
        for (String word : second) {
            result.add(word);
        }
        return new ArrayList<>(result);
    }

    public List<String> subtract(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>(first);
        for (String word : second) {
            while (result.contains(word)) {
                result.remove(word);
            }
        }

        return result;
    }
}
