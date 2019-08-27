package ro.itschool.mvnbase.tema18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hangman 1.0");
        Hangman hangman = new Hangman();
        Scanner scanner = new Scanner(System.in);
        while (!hangman.finished()) {
            System.out.println("Enter a letter: ");
            String line = scanner.nextLine();
            if(line.length()==1 && Character.isLetter(line.charAt(0))){
                hangman.guess(line.charAt(0));
            }else{
                System.out.println("I said letter.. BOOM!");
            }
        }
    }
}
