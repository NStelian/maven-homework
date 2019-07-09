package ro.itschool.mvnbase.tema10;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("pix");
        words.add("creion");
        words.add("apa");
        words.add("NSApusculita");

        System.out.println(prefixCheck("NSA",words));

        System.out.println(concat(words));
    }

    public static List<String> prefixCheck(String prefix, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            if (!element.contains(prefix)) {
                result.add(element);
            }
        }
        return result;
    }

    public static List<String> uniqueElements(List<String> words){
        List<String> result = new ArrayList<>();
        for (String element : words){
            if(!result.contains(element)){
                result.add(element);
            }
        }
        return result;
    }

    public static String concat(List<String> words){
        String sentence="";
        for (String word:words){
            sentence+=word +" ";
        }

        return sentence;
    }
}
