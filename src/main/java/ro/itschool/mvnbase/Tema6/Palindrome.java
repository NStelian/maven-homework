package ro.itschool.mvnbase.Tema6;

public class Palindrome {
    public boolean palNumberCheck(int number) {
        int copy = number;
        int rebmun = 0;

        while (copy != 0) {
            rebmun = rebmun * 10 + copy % 10;
            copy /= 10;
        }
        System.out.println(rebmun);
        if (number == rebmun) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean palStringCheck(String word) {
        word = word.replaceAll("\\s","").replaceAll("[^a-zA-Z ]", "").toLowerCase();;
        String drow = "";
        int i = word.length() - 1;
        int j = word.length();
        while (j != 0) {
            drow += word.substring(i, j);
            i--;
            j--;
        }
        if (word.equals(drow)) {
            return true;
        } else {
            return false;
        }
    }
}
