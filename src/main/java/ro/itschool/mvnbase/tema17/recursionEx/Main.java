package ro.itschool.mvnbase.tema17.recursionEx;

public class Main {
    public static void main(String[] args) {
        StringReverse stringReverse=new StringReverse();
        System.out.println(stringReverse.reverse("word"));

        DigitSum digitSum = new DigitSum();
        System.out.println(digitSum.sum(1234));

        ZeroCounter zeroCounter = new ZeroCounter();
        System.out.println(zeroCounter.count(10010230));
    }
}
