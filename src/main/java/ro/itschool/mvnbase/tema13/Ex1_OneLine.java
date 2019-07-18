package ro.itschool.mvnbase.tema13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_OneLine {
    public static void main(String[] args) throws IOException {
        BufferedReader breader = new BufferedReader(new FileReader("src/main/resources/tema13/ex1.in"));
        String line = breader.readLine();
        System.out.println(line);
    }
}
