package ro.itschool.mvnbase.tema16.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("How old are you?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        BirthYearCalculator birthYearCalculator = new BirthYearCalculator(age);
        System.out.println(birthYearCalculator.calculate());

    }
}
