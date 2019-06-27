package ro.itschool.mvnbase.tema6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.itschool.mvnbase.Tema6.Palindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @Test
    @DisplayName("WHEN receive a number THEN return if is palindrome or not")
    void normalUsageNumber(){
        //SETUP
        Palindrome pal = new Palindrome();

        //RUN
        boolean result = pal.palNumberCheck(101);

        //ASSERT
        assertEquals(true,result);
    }
    @Test
    @DisplayName("WHEN receive a word THEN return if is palindrome or not")
    void normalUsageString(){
        //SETUP
        Palindrome pal = new Palindrome();

        //RUN
        boolean result = pal.palStringCheck("mam");

        //ASSERT
        assertEquals(true,result);
    }
    @Test
    @DisplayName("WHEN receive a word with punctuation marks THEN return if is palindrome or not")
    void wordPunctuationMarks(){
        //SETUP
        Palindrome pal = new Palindrome();

        //RUN
        boolean result = pal.palStringCheck("m, a, m");

        //ASSERT
        assertEquals(true,result);
    }
    @Test
    @DisplayName("WHEN receive a word with white spaces THEN return if is palindrome or not")
    void wordWithWhiteSpaces(){
        //SETUP
        Palindrome pal = new Palindrome();

        //RUN
        boolean result = pal.palStringCheck("m a m");

        //ASSERT
        assertEquals(true,result);
    }
    @Test
    @DisplayName("WHEN receive a word with capital letters THEN return if is palindrome or not")
    void wordWithCapitalLetters(){
        //SETUP
        Palindrome pal = new Palindrome();

        //RUN
        boolean result = pal.palStringCheck("Mam");

        //ASSERT
        assertEquals(true,result);
    }
    @Test
    @DisplayName("WHEN receive sentence THEN return if is palindrome or not")
    void sentence(){
        //SETUP
        Palindrome pal = new Palindrome();

        //RUN
        boolean result = pal.palStringCheck("Never a foot too far, even.");

        //ASSERT
        assertEquals(true,result);
    }
}
