package ro.itschool.mvnbase.tema18;

import java.util.Random;

public class Dictionary {
    private final String[] words;

    public Dictionary() {
        this.words = new String[]{
                "masa",
                "pian",
                "calculator",
                "canapea",
                "geam",
                "biblioteca"};
    }

    public String generate() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}
