package ro.itschool.mvnbase.tema12;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    private final List<String> first;
    private final List<String> second;

    public ListOperations(List<String> first, List<String> second) {
        this.first = first;
        this.second = second;
    }

    public boolean compare() {
        return first.equals(second);
    }

    public List<String> intersect() {
        List<String> result = new ArrayList<>();
        for (String word : first) {
            for (String word2 : second) {
                if (word.equals(word2)) {
                    result.add(word);
                }
            }
        }
        return result;
    }

    public List<String> union() {
        List<String> result = new ArrayList<>();
        for (String word : first) {
            if (!result.contains(word)) {
                result.add(word);
            }
        }
        for (String word : second) {
            if (!result.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }

    public List<String> subtract() {
        List<String> result = new ArrayList<>(first);
        for (String word : second) {
            if (result.contains(word)) {
                result.remove(word);
            }
        }

        return result;
    }
}
