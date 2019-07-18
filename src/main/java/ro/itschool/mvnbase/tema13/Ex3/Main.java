package ro.itschool.mvnbase.tema13.Ex3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ExamResultReader examReader = new ExamResultReader("src/main/resources/tema13/ex3.in");

        System.out.println(examReader.getExams());
    }
}
