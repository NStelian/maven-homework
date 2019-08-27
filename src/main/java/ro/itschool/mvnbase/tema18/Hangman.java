package ro.itschool.mvnbase.tema18;

public class Hangman {
    private final String word;
    private String found;
    private Dictionary dictionary;

    public Hangman() {
        this.dictionary = new Dictionary();
        this.word = dictionary.generate();
        this.found = initializeFound(word); //found = "_".repeat(word.length());
    }

    public String getWord() {
        return word;
    }

    public String getFound() {
        return found;
    }

    public boolean finished() {
        //return found.equals(word);
        if (found.contains("_")) {
            return false;
        }
        System.out.println("Good job! You found it! The word was " + word);
        return true;
    }

    private String initializeFound(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += "_";
        }
        return result;
    }

    public boolean guess(char c) {
        // fa un bool=false,in while ii true si returneaza-l
        if (word.indexOf(c) != -1) {
            String copy = word;
            while (copy.indexOf(c) != -1) {
                found = found.substring(0, copy.indexOf(c)) + c + found.substring(copy.indexOf(c) + 1);
                copy = copy.substring(0, copy.indexOf(c)) + "_" + copy.substring(copy.indexOf(c) + 1);
            }
            System.out.println("Corect! Word: " + getFound());
            return true;
        } else {
            System.out.println("Wrong! Word: " + getFound());
            return false;
        }
    }
}
