package ro.itschool.mvnbase.tema13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_ReadnWrite {
    public static void main(String[] args) throws IOException {
        BufferedReader breader = new BufferedReader(new FileReader("src/main/resources/tema13/ex2.in"));
        String line = breader.readLine();
        while(line!=null){
            System.out.println(line);
            line=breader.readLine();
        }
    }
}
