package ro.itschool.mvnbase.tema16.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomAgeException {
        System.out.println("How old are you?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        BirthYearCalculator birthYearCalculator = new BirthYearCalculator(age);
        System.out.println(birthYearCalculator.calculate());
    }
}
