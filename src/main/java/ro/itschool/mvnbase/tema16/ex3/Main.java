package ro.itschool.mvnbase.tema16.ex3;

public class Main {
    public static void main(String[] args) throws PositionException {
        IntTools intTools = new IntTools(12345);
        System.out.println(intTools.digitSum());
        System.out.println(intTools.lastDigit());
        System.out.println(intTools.digitAt(0));
    }
}
