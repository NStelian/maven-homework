package ro.itschool.mvnbase.Tema6;

public class Palindrome {
    public boolean palNumberCheck(int number) {
        int copy = number;
        int rebmun = 0;

        while (copy != 0) {
            rebmun = rebmun * 10 + copy % 10;
            copy /= 10;
        }
        return number == rebmun;
    }

    public static boolean palStringCheck(String word) {
        word = word.replaceAll("\\s","").replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String drow = "";
        int i = word.length() - 1;
        while (i != -1) {
            drow += word.charAt(i);
            i--;
        }
        return word.equals(drow);
    }
}
